package com.proyecto.favseries;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
 
public class Buscar_serie_lista extends Activity{
	

	Button bn9,bn10,bn16;
	
	ImageView feed_image;
	Drawable img;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.list_view_item_buscar);
        
        int position = getIntent().getIntExtra("POSITION", 0);
        
        img = getDrawableResource(position);
        
        feed_image = (ImageView) findViewById(R.id.feed_image);
        
        feed_image.setImageDrawable(img);
        
        
        
        bn9 = (Button) findViewById(R.id.button9);
        bn10 = (Button) findViewById(R.id.button10);
        bn16 = (Button) findViewById(R.id.button16);
       
        
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
			                    "Catálogo de FavSeries", Toast.LENGTH_SHORT);
			 
			        toastvolver.show();
				
				Intent  i2 = new Intent(Buscar_serie_lista.this, Buscador.class);
				startActivity(i2);
			}
			
		});
        
        bn16.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				
				Intent  i2 = new Intent(Buscar_serie_lista.this, Tempocap.class);
				startActivity(i2);
			}
			
		});
        
      
        TextView txtProduct = (TextView) findViewById(R.id.textviewbuscar);
        
        
        
      
        
        // getting attached intent data
        
        String nombre = ((FavSeriesApplication)getApplication()).getSeriesbuscar()[position];//i.getStringExtra("product");
        String sinopsis = ((FavSeriesApplication)getApplication()).getSinopsisbuscar()[position];
        // displaying selected product name
        txtProduct.setText(nombre);
        ((TextView) findViewById(R.id.textviewbuscar2)).setText(sinopsis);
        
    }
   
        private Drawable getDrawableResource(int position){
    		Drawable result = null;
    		int id = 0;

    		switch(position){
    		
    		case 0:
    			id = R.drawable.anatomiagreybanner;
    			break;
    			
    		case 1:
    			id = R.drawable.bonesbanner;
    			break;
    			
    		case 2:
    			id = R.drawable.calicobanner;
    			break;
    			
    		case 3:
    			id = R.drawable.comoconocibanner;
    			break;
    			
    		case 4:
    			id = R.drawable.dexterbanner;
    			break;
    			
    		case 5:
    			id = R.drawable.equipoabanner;
    			break;
    			
    		case 6:
    			id = R.drawable.familyguybanner;
    			break;
    			
    		case 7:
    			id = R.drawable.friendsbanner;
    			break;
    			
    		case 8:
    			id = R.drawable.futuramabanner;
    			break;
    			
    		case 9:
    			id = R.drawable.gossipbanner;
    			break;
    			
    		case 10:
    			id = R.drawable.heidibanner;
    			break;
    			
    		case 11:
    			id = R.drawable.housebanner;
    			break;
    			
    		case 12:
    			id = R.drawable.imperiumbanner;
    			break;
    			
    		case 13:
    			id = R.drawable.jerichobanner;
    			break;
    			
    		case 14:
    			id = R.drawable.tronosbanner;
    			break;
    			
    		case 15:
    			id = R.drawable.kimbanner;
    			break;
    			
    		case 16:
    			id = R.drawable.simpsonbanner;
    			break;
    			
    		case 17:
    			id = R.drawable.modernfamilybanner;
    			break;
    			
    		case 18:
    			id = R.drawable.desperatebanner;
    			break;
    			
    		case 19:
    			id = R.drawable.narutobanner;
    			break;
    			
    		case 20:
    			id = R.drawable.revengebanner;
    			break;
    			
    		case 21:
    			id = R.drawable.supernaturalbanner;
    			break;
    			
    		case 22:
    			id = R.drawable.bigbangbanner;
    			break;
    			
    		case 23:
    			id = R.drawable.wakingdeadbanner;
    			break;
 
    		}
		
		result = getResources().getDrawable(id);
		return result;
        
        }
        
}
  
    
