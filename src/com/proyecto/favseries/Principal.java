package com.proyecto.favseries;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Principal extends Activity {

	private Button bn4,bn5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	
	
	bn4 = (Button) findViewById(R.id.button4);
	bn5 = (Button) findViewById(R.id.button5);
	
	bn4.setOnClickListener(new OnClickListener(){
		
		
		public void onClick(View view) {
			
			AlertDialog.Builder alert=new AlertDialog.Builder(Principal.this);
			
		    alert.setMessage("Con FavSeries podrás buscar información sobre la serie que tú necesites ,saber cuáles son las más exitosas del momento y además hacer un seguimiento diario de tus series.A qué esperas para entrar?");
		    alert.setTitle("FavSeries");
		    alert.setPositiveButton("Entrar!", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int which) {
	            	Intent  i2 = new Intent(Principal.this, Principaldos.class);
	    			startActivity(i2);
	            }
	        });
		    alert.show();
		  
			}
		
		});
	
	bn5.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
		
				
		AlertDialog.Builder builder = new AlertDialog.Builder(Principal.this);
		
		builder.setMessage("¿Estas seguro que quieres salir?")
		        .setTitle("FavSeries")
		        .setCancelable(false)
		        .setNegativeButton("Cancelar",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                })
		        .setPositiveButton("Salir",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                    	SalirAplicacion();
		                    	setResult(RESULT_OK);
		    					finish();
		                    }

							private void SalirAplicacion() {
								// TODO Auto-generated method stub
								
							}
		                });
		AlertDialog alert = builder.create();
		alert.show();
			
			

		}
	});
	
	
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_principal, menu);
		return true;
	}

}
