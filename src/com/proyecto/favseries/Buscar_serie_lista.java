package com.proyecto.favseries;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
 
public class Buscar_serie_lista extends Activity{
	
	private RatingBar ratingBar1;
	Button bn9,bn10,bn13;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.list_view_item_buscar);
        
        addListenerOnRatingBar();
        addListenerOnButton();
        
    }
        
        public void addListenerOnRatingBar() {
        	 
        	ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
        	
          	ratingBar1.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
        		public void onRatingChanged(RatingBar ratingBar, float rating,
        			boolean fromUser) {
        			
        			
         
        		}
        	});
          	
        }
        
          	public void addListenerOnButton() {
          		 
          		ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
          		bn13 = (Button) findViewById(R.id.button13);
          	 
          		//if click on me, then display the current rating value.
          		bn13.setOnClickListener(new OnClickListener() {
          	 
          			@Override
          			public void onClick(View v) {
          	 
          				Toast.makeText(Buscar_serie_lista.this,
          					String.valueOf(ratingBar1.getRating()),
          						Toast.LENGTH_SHORT).show();
          	 
          			}
          	 
          		});
          
        
        bn9 = (Button) findViewById(R.id.button9);
        bn10 = (Button) findViewById(R.id.button10);
        bn13 = (Button) findViewById(R.id.button13);
        
        bn9.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				Toast toastañadir =
			            Toast.makeText(getApplicationContext(),
			                    "Serie añadida!", Toast.LENGTH_SHORT);
			 
			        toastañadir.show();
				
				Intent  i1 = new Intent(Buscar_serie_lista.this, MisSeries.class);
				startActivity(i1);
			}
	
		});
        
        bn10.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				Toast toastvolver =
			            Toast.makeText(getApplicationContext(),
			                    "Catálogo de de FavSeries", Toast.LENGTH_SHORT);
			 
			        toastvolver.show();
				
				Intent  i2 = new Intent(Buscar_serie_lista.this, Buscador.class);
				startActivity(i2);
			}
			
		});
        
      
        TextView txtProduct = (TextView) findViewById(R.id.textviewbuscar);
 
        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("product");
        // displaying selected product name
        txtProduct.setText(product);
 
    }
}
