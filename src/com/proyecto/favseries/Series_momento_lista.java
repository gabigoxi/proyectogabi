package com.proyecto.favseries;
 
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
 
public class Series_momento_lista extends Activity {
	
	Button bn11,bn12,bn14;
	
	ImageView feed_image2;
	Drawable img2;
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.list_view_item_momento);
        
        int position2 = getIntent().getIntExtra("POSITION2", 0);
        
        img2 = getDrawableResource(position2);
        
        feed_image2 = (ImageView) findViewById(R.id.feed_image2);
        
        feed_image2.setImageDrawable(img2);
        
        bn11 = (Button) findViewById(R.id.button11);
        bn12 = (Button) findViewById(R.id.button12);
        bn14 = (Button) findViewById(R.id.button14);
        
        bn11.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				Toast toastañadir =
			            Toast.makeText(getApplicationContext(),
			                    "Serie añadida!", Toast.LENGTH_SHORT);
			 
				toastañadir.show();
				
				Intent  i1 = new Intent(Series_momento_lista.this, MisSeries.class);
				startActivity(i1);
			}
	
		});
        
        bn12.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				Toast toastvolver =
			            Toast.makeText(getApplicationContext(),
			                    "Catálogo de Series más vistas", Toast.LENGTH_SHORT);
			 
			        toastvolver.show();
				
				Intent  i2 = new Intent(Series_momento_lista.this, Seriesmomento.class);
				startActivity(i2);
			}
			
		});
        
        bn14.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				
				Intent  i2 = new Intent(Series_momento_lista.this, Tempocapdos.class);
				startActivity(i2);
			}
			
		});
       
 
        TextView txtProduct = (TextView) findViewById(R.id.textviewmomento);
 

        
        // getting attached intent data
        String nombre = ((FavSeriesApplication)getApplication()).getSeriesmomento()[position2];//i.getStringExtra("product");
        String sinopsis = ((FavSeriesApplication)getApplication()).getSinopsismomento()[position2];
        // displaying selected product name
        txtProduct.setText(nombre);
        ((TextView) findViewById(R.id.textviewmomento2)).setText(sinopsis);
        
    }

    private Drawable getDrawableResource(int position){
		Drawable result = null;
		int id = 0;

		switch(position){
		
		case 0:
			id = R.drawable.tronosbanner;
			break;
			
		case 1:
			id = R.drawable.comoconocibanner;
			break;
			
		case 2:
			id = R.drawable.bigbangbanner;
			break;
			
		case 3:
			id = R.drawable.housebanner;
			break;
			
		case 4:
			id = R.drawable.gossipbanner;
			break;
			
		case 5:
			id = R.drawable.modernfamilybanner;
			break;
			
		case 6:
			id = R.drawable.desperatebanner;
			break;
			
		case 7:
			id = R.drawable.wakingdeadbanner;
			break;
			
		case 8:
			id = R.drawable.simpsonbanner;
			break;
	
		}
	
	result = getResources().getDrawable(id);
	return result;
    
    }
    
}


