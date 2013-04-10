package com.proyecto.favseries;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Principaldos extends Principal {
	
	private Button bn1,bn2,bn3;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal2);
		
	bn1 = (Button) findViewById(R.id.button1);
	bn2 = (Button) findViewById(R.id.button2);
	bn3 = (Button) findViewById(R.id.button3);
		
		
		bn1.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				Intent  i2 = new Intent(Principaldos.this, Buscador.class);
				startActivity(i2);
			}
			
		});
		
		bn2.setOnClickListener(new OnClickListener(){
			
		public void onClick(View view) {
			Intent  i2 = new Intent(Principaldos.this, Seriesmomento.class);
			startActivity(i2);
			}
		});
		
		bn3.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				Intent  i2 = new Intent(Principaldos.this, MisSeries.class);
				startActivity(i2);
				}
			});
		
	}
}

		
	
	
