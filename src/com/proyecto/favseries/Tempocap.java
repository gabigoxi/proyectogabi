package com.proyecto.favseries;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Tempocap extends Activity {
	
	private Button bn15;
	private Spinner s1,s2;
	private SharedPreferences prefs,prefs1;
	private String prefName = "spinner_value";
	private String prefName2 = "spinner_value2";
	int id=0;
	int id2=0;
	void showToast(CharSequence msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
	}
	
	private final String BUNDLE_TEMPCAP = "BundleTempCap";
    FavSeriesApplication objeto;
    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.temporadascapitulos);
		 
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
        	objeto = bundle.getParcelable(BUNDLE_TEMPCAP);
        	
	        
		
		bn15 = (Button) findViewById(R.id.button15);
		
			bn15.setOnClickListener(new OnClickListener(){
				
				public void onClick(View view) {
					
					Toast toastatras =
				            Toast.makeText(getApplicationContext(),
				                    "Información guardada!", Toast.LENGTH_SHORT);
				 
				        toastatras.show();
					
					Intent  i3 = new Intent(Tempocap.this, Buscador.class);
					startActivity(i3);
				}
				
			});
			
			
			s1 = (Spinner) findViewById(R.id.tem);
			
			//Creamos el adaptador
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,(String[])objeto.getSpinnertemporadas());
			//Añadimos el layout para el menú
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			//Le indicamos al spinner el adaptador a usar
			s1.setAdapter(adapter);

			prefs = getSharedPreferences(prefName, MODE_PRIVATE);
			id=prefs.getInt("last_val",0);
			s1.setSelection(id);
			
				     
			s1.setOnItemSelectedListener(new OnItemSelectedListener() {
				
		
			public void onItemSelected(AdapterView<?> arg0, View arg1,int pos, long arg3) {
			// TODO Auto-generated method stub
				
				prefs = getSharedPreferences(prefName, MODE_PRIVATE);
				SharedPreferences.Editor editor = prefs.edit();
				//---save the values in the EditText view to preferences---
				editor.putInt("last_val", pos);
				  
				//---saves the values---
				editor.commit();
	    
				
			}
			

				@Override
				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub
				
				}
			});
		 
	
			s2 =(Spinner) findViewById(R.id.cap);
		
			//Creamos el adaptador
			ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,(String[])objeto.getSpinnercapitulos());
			//Añadimos el layout para el menú
			adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			//Le indicamos al spinner el adaptador a usar
			s2.setAdapter(adapter2);

			prefs1 = getSharedPreferences(prefName2, MODE_PRIVATE);
			id2=prefs1.getInt("last_val2",0);
			s2.setSelection(id2);

		s2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int pos, long arg3) {
			// TODO Auto-generated method stub
				

			prefs1 = getSharedPreferences(prefName2, MODE_PRIVATE);
			SharedPreferences.Editor editor = prefs1.edit();
			//---save the values in the EditText view to preferences---
			editor.putInt("last_val2", pos);
			  
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

	
	
	

	
