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


public class Tempocap extends Activity {
	
	private Button bn15;
	Spinner s1,s2;
	private SharedPreferences prefs,prefs1;
	private String prefName = "spinner_value";
	private String prefName2 = "spinner_value2";
	int id=0;
	int id2=0;
	void showToast(CharSequence msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.temporadascapitulos);
		
		
		final List<String> temporadasbuscar =new ArrayList<String>();
		temporadasbuscar.add("Tem.1");
		temporadasbuscar.add("Tem.2");
		temporadasbuscar.add("Tem.3");
		temporadasbuscar.add("Tem.4");
		temporadasbuscar.add("Tem.5");
		temporadasbuscar.add("Tem.6");
		temporadasbuscar.add("Tem.7");
		temporadasbuscar.add("Tem.8");
		temporadasbuscar.add("Tem.9");
		temporadasbuscar.add("Tem.10");
		temporadasbuscar.add("Tem.11");
		temporadasbuscar.add("Tem.12");
		temporadasbuscar.add("Tem.13");
		temporadasbuscar.add("Tem.14");
		temporadasbuscar.add("Tem.15");
		temporadasbuscar.add("Tem.16");
		temporadasbuscar.add("Tem.17");
		temporadasbuscar.add("Tem.18");
		temporadasbuscar.add("Tem.19");
		temporadasbuscar.add("Tem.20");
		
		final List<String> capitulosbuscar =new ArrayList<String>();
		capitulosbuscar.add("Cap.1");
		capitulosbuscar.add("Cap.2");
		capitulosbuscar.add("Cap.3");
		capitulosbuscar.add("Cap.4");
		capitulosbuscar.add("Cap.5");
		capitulosbuscar.add("Cap.6");
		capitulosbuscar.add("Cap.7");
		capitulosbuscar.add("Cap.8");
		capitulosbuscar.add("Cap.9");
		capitulosbuscar.add("Cap.10");
		capitulosbuscar.add("Cap.11");
		capitulosbuscar.add("Cap.12");
		capitulosbuscar.add("Cap.13");
		capitulosbuscar.add("Cap.14");
		capitulosbuscar.add("Cap.15");
		capitulosbuscar.add("Cap.16");
		capitulosbuscar.add("Cap.17");
		capitulosbuscar.add("Cap.18");
		capitulosbuscar.add("Cap.19");
		capitulosbuscar.add("Cap.20");
		capitulosbuscar.add("Cap.21");
		capitulosbuscar.add("Cap.22");
		capitulosbuscar.add("Cap.23");
		capitulosbuscar.add("Cap.24");
		capitulosbuscar.add("Cap.25");
		
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
			
				
			final Spinner s1 =(Spinner) findViewById(R.id.tem);
			ArrayAdapter<String> adp= new ArrayAdapter<String>(this,
			                                android.R.layout.simple_list_item_1,temporadasbuscar);
			adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			s1.setAdapter(adp);

			prefs = getSharedPreferences(prefName, MODE_PRIVATE);
			id=prefs.getInt("last_val",0);
			s1.setSelection(id);

			s1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int pos, long arg3) {
			// TODO Auto-generated method stub

			prefs = getSharedPreferences(prefName, MODE_PRIVATE);
			SharedPreferences.Editor editor = prefs.edit();
			//---save the values in the EditText view to preferences---
			editor.putInt("last_val", pos);
			  
			//---saves the values---
			editor.commit();

		//	Toast.makeText(getBaseContext(), s1.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
			               
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			                               
			}
			});
			     
	
			final Spinner s2 =(Spinner) findViewById(R.id.cap);
			ArrayAdapter<String> adp3= new ArrayAdapter<String>(this,
			                                android.R.layout.simple_list_item_1,capitulosbuscar);
			adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			s2.setAdapter(adp3);

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

		//	Toast.makeText(getBaseContext(), s2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
			               
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			                               
			}
			});

	}
	
}
	
