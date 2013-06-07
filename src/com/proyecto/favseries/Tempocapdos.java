package com.proyecto.favseries;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class Tempocapdos extends Activity {
	
	private Button bn18;
	Spinner s3,s4;
	private SharedPreferences prefs2,prefs3;
	private String prefName3 = "spinner_value3";
	private String prefName4 = "spinner_value4";
	int id3=0;
	int id4=0;
	void showToast(CharSequence msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
	
	private final String BUNDLE_TEMPCAP2 = "BundleTempCap2";
    FavSeriesApplication objeto2;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.temporadascapitulosdos);
		
		
		
		Bundle bundle = getIntent().getExtras();
        if(bundle != null){
        	
        	objeto2 = bundle.getParcelable(BUNDLE_TEMPCAP2);
       	
		
		bn18 = (Button) findViewById(R.id.button18);
		
			bn18.setOnClickListener(new OnClickListener(){
				
				public void onClick(View view) {
					
					Toast toastatras =
				            Toast.makeText(getApplicationContext(),
				                    "Información guardada!", Toast.LENGTH_SHORT);
				 
				        toastatras.show();
					
					Intent  i4 = new Intent(Tempocapdos.this, Seriesmomento.class);
					startActivity(i4);
				}
				
			});
			
				
			final Spinner s3 =(Spinner) findViewById(R.id.tem2);
			
			//Creamos el adaptador
			ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,(String[])objeto2.getSpinnertemporadas());
			//Añadimos el layout para el menú
			adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			//Le indicamos al spinner el adaptador a usar
			s3.setAdapter(adapter3);

			prefs2 = getSharedPreferences(prefName3, MODE_PRIVATE);
			id3=prefs2.getInt("last_val3",0);
			s3.setSelection(id3);

			s3.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int pos, long arg3) {
			// TODO Auto-generated method stub
				

			prefs2 = getSharedPreferences(prefName3, MODE_PRIVATE);
			SharedPreferences.Editor editor = prefs2.edit();
			//---save the values in the EditText view to preferences---
			editor.putInt("last_val3", pos);
			  
			//---saves the values---
			editor.commit();
			               
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			                               
			}
			});
			     
	
		 s4 =(Spinner) findViewById(R.id.cap2);
			
			//Creamos el adaptador
			ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,(String[])objeto2.getSpinnercapitulos());
			//Añadimos el layout para el menú
			adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			//Le indicamos al spinner el adaptador a usar
			s4.setAdapter(adapter4);


			prefs3 = getSharedPreferences(prefName4, MODE_PRIVATE);
			id4=prefs3.getInt("last_val4",0);
			s4.setSelection(id4);

			s4.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int pos, long arg3) {
			// TODO Auto-generated method stub
				
				
			prefs3 = getSharedPreferences(prefName4, MODE_PRIVATE);
			SharedPreferences.Editor editor = prefs3.edit();
			//---save the values in the EditText view to preferences---
			editor.putInt("last_val4", pos);
			  
			//---saves the values---
			editor.commit();

			               
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			                               
			}
			});
			
	}
}
	
}
