package com.proyecto.favseries;
 
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
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
	 private final String BUNDLE2 = "Bundle2";
	 private final String BUNDLE_TEMPCAP2 = "BundleTempCap2";
	 FavSeriesApplication objeto2;
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.setContentView(R.layout.list_view_item_momento);
        
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
        	objeto2 = bundle.getParcelable(BUNDLE2);
	        
	        feed_image2 = (ImageView) findViewById(R.id.feed_image2);
	        feed_image2.setImageResource(objeto2.getBanner());
        
        bn11 = (Button) findViewById(R.id.button11);
        bn12 = (Button) findViewById(R.id.button12);
        bn14 = (Button) findViewById(R.id.button14);
        
        bn11.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) {
				
				Toast toastmisseries =
			            Toast.makeText(getApplicationContext(),
			                    "Opción disponible en un futuro!", Toast.LENGTH_SHORT);
			 
				toastmisseries.show();
				
				//Intent  i1 = new Intent(Series_momento_lista.this, MisSeries.class);
				//startActivity(i1);
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
				
				
				Bundle bundle = new Bundle();
				Intent  i2 = new Intent(Series_momento_lista.this, Tempocapdos.class);
				bundle.putParcelable(BUNDLE_TEMPCAP2, objeto2);
				i2.putExtras(bundle);
				startActivity(i2);
			}
			
		});
       
 
        TextView txtProduct = (TextView) findViewById(R.id.textviewmomento);
        
        
        // getting attached intent data
        
        String nombre = objeto2.getNombre();//i.getStringExtra("product");
        String sinopsis = objeto2.getSinopsis();
        // displaying selected product name
        txtProduct.setText(nombre);
        ((TextView) findViewById(R.id.textviewmomento2)).setText(sinopsis);

        
        }
    }
}


