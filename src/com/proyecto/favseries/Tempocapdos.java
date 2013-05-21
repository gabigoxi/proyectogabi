package com.proyecto.favseries;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
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
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.temporadascapitulosdos);
		
		
		final List<String> temporadasmomento =new ArrayList<String>();
		temporadasmomento.add("Tem.1");
		temporadasmomento.add("Tem.2");
		temporadasmomento.add("Tem.3");
		temporadasmomento.add("Tem.4");
		temporadasmomento.add("Tem.5");
		temporadasmomento.add("Tem.6");
		temporadasmomento.add("Tem.7");
		temporadasmomento.add("Tem.8");
		temporadasmomento.add("Tem.9");
		temporadasmomento.add("Tem.10");
		temporadasmomento.add("Tem.11");
		temporadasmomento.add("Tem.12");
		temporadasmomento.add("Tem.13");
		temporadasmomento.add("Tem.14");
		temporadasmomento.add("Tem.15");
		temporadasmomento.add("Tem.16");
		temporadasmomento.add("Tem.17");
		temporadasmomento.add("Tem.18");
		temporadasmomento.add("Tem.19");
		temporadasmomento.add("Tem.20");
		
		final List<String> capitulosmomento =new ArrayList<String>();
		capitulosmomento.add("Cap.1");
		capitulosmomento.add("Cap.2");
		capitulosmomento.add("Cap.3");
		capitulosmomento.add("Cap.4");
		capitulosmomento.add("Cap.5");
		capitulosmomento.add("Cap.6");
		capitulosmomento.add("Cap.7");
		capitulosmomento.add("Cap.8");
		capitulosmomento.add("Cap.9");
		capitulosmomento.add("Cap.10");
		capitulosmomento.add("Cap.11");
		capitulosmomento.add("Cap.12");
		capitulosmomento.add("Cap.13");
		capitulosmomento.add("Cap.14");
		capitulosmomento.add("Cap.15");
		capitulosmomento.add("Cap.16");
		capitulosmomento.add("Cap.17");
		capitulosmomento.add("Cap.18");
		capitulosmomento.add("Cap.19");
		capitulosmomento.add("Cap.20");
		capitulosmomento.add("Cap.21");
		capitulosmomento.add("Cap.22");
		capitulosmomento.add("Cap.23");
		capitulosmomento.add("Cap.24");
		capitulosmomento.add("Cap.25");
		
		
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
			ArrayAdapter<String> adp4= new ArrayAdapter<String>(this,
			                                android.R.layout.simple_list_item_1,temporadasmomento);
			adp4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			s3.setAdapter(adp4);

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

		//	Toast.makeText(getBaseContext(), s3.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
			               
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			                               
			}
			});
			     
	
			final Spinner s4 =(Spinner) findViewById(R.id.cap2);
			ArrayAdapter<String> adp2= new ArrayAdapter<String>(this,
			                                android.R.layout.simple_list_item_1,capitulosmomento);
			adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			s4.setAdapter(adp2);

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

		//	Toast.makeText(getBaseContext(), s4.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
			               
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			                               
			}
			});
			
	}
}
