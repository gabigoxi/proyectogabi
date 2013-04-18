package com.proyecto.favseries;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
 
public class Series_momento_lista extends Activity{
	
	Button bn11,bn12;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.list_view_item_momento);
        
        bn11 = (Button) findViewById(R.id.button11);
        bn12 = (Button) findViewById(R.id.button12);
        
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
				
				Intent  i2 = new Intent(Series_momento_lista.this, Buscador.class);
				startActivity(i2);
			}
			
		});
       
 
        TextView txtProduct = (TextView) findViewById(R.id.textviewmomento);
 
        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("product");
        // displaying selected product name
        txtProduct.setText(product);
 
    }
}
