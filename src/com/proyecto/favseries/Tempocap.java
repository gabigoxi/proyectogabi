package com.proyecto.favseries;

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
	void showToast(CharSequence msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.temporadascapitulos);
		
		
		
		bn15 = (Button) findViewById(R.id.button15);
		
			bn15.setOnClickListener(new OnClickListener(){
				
				public void onClick(View view) {
					
					Toast toastatras =
				            Toast.makeText(getApplicationContext(),
				                    "Información guardada!", Toast.LENGTH_SHORT);
				 
				        toastatras.show();
					
					Intent  i3 = new Intent(Tempocap.this, Series_momento_lista.class);
					startActivity(i3);
				}
				
			});
			
				
		Spinner s1 = (Spinner) findViewById(R.id.tem);
		
		ArrayAdapter spinner_adapter1 = ArrayAdapter.createFromResource( this, R.array.temporadas , android.R.layout.simple_spinner_item);
		spinner_adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		s1.setAdapter(spinner_adapter1);
		 s1.setOnItemSelectedListener(
	                new OnItemSelectedListener() {
	                    public void onItemSelected(
	                            AdapterView<?> parent, View view, int position, long id) {
	                        
	                    }

	                    public void onNothingSelected(AdapterView<?> parent) {
	                        
	                    }
	                });
		
		
		Spinner s2 = (Spinner) findViewById(R.id.cap);
		ArrayAdapter spinner_adapter2= ArrayAdapter.createFromResource( this, R.array.capitulos , android.R.layout.simple_spinner_item);
		spinner_adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		s2.setAdapter(spinner_adapter2);
		s2.setOnItemSelectedListener(
                new OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        
                    }
                });
	
	
	}
	
	@Override    
	protected void onSaveInstanceState( Bundle savedInstanceState){
	super.onSaveInstanceState(savedInstanceState);


	}
	
}
	
