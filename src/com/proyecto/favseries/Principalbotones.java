package com.proyecto.favseries;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Principalbotones extends Activity {
	
	private Button bn1,bn2,bn3;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.principal2);
		
	bn1 = (Button) findViewById(R.id.button1);
	bn2 = (Button) findViewById(R.id.button2);
	bn3 = (Button) findViewById(R.id.button3);
		
		
		bn1.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				Intent  i2 = new Intent(Principalbotones.this, Buscador.class);
				startActivity(i2);
			}
			
		});
		
		bn2.setOnClickListener(new OnClickListener(){
			
		public void onClick(View view) {
			Intent  i2 = new Intent(Principalbotones.this, Seriesmomento.class);
			startActivity(i2);
			}
		});
		
		bn3.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				Toast toastmisseries =
			            Toast.makeText(getApplicationContext(),
			                    "Opción disponible en un futuro!", Toast.LENGTH_SHORT);
			 
				toastmisseries.show();
				
				//Intent  i2 = new Intent(Principaldos.this, MisSeries.class);
				//startActivity(i2);
				}
			});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_principal, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.acercade:
		 Intent intentAcercade = new Intent(Principalbotones.this, AcercaDe.class);
		 startActivity(intentAcercade);
		return true;

		}
		return false;
	}
		
		public void lanzarAcercade(){
	    	Intent i = new Intent(this, AcercaDe.class);
	    	startActivity(i);
	    	
	    }
	
}


		
	
	
