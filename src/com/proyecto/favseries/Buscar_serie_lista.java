package com.proyecto.favseries;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Buscar_serie_lista extends Activity{

	Button bn9,bn10,bn16;
	ImageView feed_image;
    private final String BUNDLE = "Bundle";
    private final String BUNDLE_TEMPCAP = "BundleTempCap";
    FavSeriesApplication objeto;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.setContentView(R.layout.list_view_item_buscar);
        
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
        	objeto = bundle.getParcelable(BUNDLE);
	        
	        feed_image = (ImageView) findViewById(R.id.feed_image);
	        feed_image.setImageResource(objeto.getBanner());
	        
	        
	        
	        bn9 = (Button) findViewById(R.id.button9);
	        bn10 = (Button) findViewById(R.id.button10);
	        bn16 = (Button) findViewById(R.id.button16);
	       
	        
	        bn9.setOnClickListener(new OnClickListener(){
				
				public void onClick(View view) {
					
					Toast toastmisseries =
				            Toast.makeText(getApplicationContext(),
				                    "Opción disponible en un futuro!", Toast.LENGTH_SHORT);
				 
					toastmisseries.show();
					
				//	Intent  i1 = new Intent(Buscar_serie_lista.this, MisSeries.class);
					//startActivity(i1);
				}
		
			});
	        
	        bn10.setOnClickListener(new OnClickListener(){
				
				public void onClick(View view) {
					
					Toast toastvolver =
				            Toast.makeText(getApplicationContext(),
				                    "Catálogo de FavSeries", Toast.LENGTH_SHORT);
				 
				        toastvolver.show();
					Intent  i2 = new Intent(Buscar_serie_lista.this, Buscador.class);
					
					startActivity(i2);
				}
				
			});
	        
	        bn16.setOnClickListener(new OnClickListener(){
				
				public void onClick(View view) {
					
					Bundle bundle = new Bundle();
					Intent  i2 = new Intent(Buscar_serie_lista.this, Tempocap.class);
					bundle.putParcelable(BUNDLE_TEMPCAP, objeto);
					i2.putExtras(bundle);
					startActivity(i2);
				}
				
			});
	        
	        
	        
	      
	        TextView txtProduct = (TextView) findViewById(R.id.textviewbuscar);
	        
	        
	        // getting attached intent data
	        
	        String nombre = objeto.getNombre();//i.getStringExtra("product");
	        String sinopsis = objeto.getSinopsis();
	        // displaying selected product name
	        txtProduct.setText(nombre);
	        ((TextView) findViewById(R.id.textviewbuscar2)).setText(sinopsis);
        }
    }
   
        
        
}
  
    
