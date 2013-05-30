package com.proyecto.favseries;


import com.proyecto.favseries.Buscador.AdaptadorLista;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
 

public class Seriesmomento extends Activity {
	private ListView listaSeries2;
	AdaptadorLista2 adaptador2;
	private EditText buscador2;
	String intentString;
	String[] series_momento;
	
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seriesmomento);
        
    //   EditText buscador2 = (EditText)findViewById(R.id.buscador2);
     //   ListView listaSeries2 = (ListView)findViewById(R.id.listview2);
        
 
        // String
        series_momento = getResources().getStringArray(R.array.series_momento);
        series_momento = ((FavSeriesApplication)getApplication()).getSeriesmomento();
        listaSeries2 = (ListView)findViewById(R.id.listview2);
        buscador2 = (EditText)findViewById(R.id.buscador2);
        
        adaptador2 = new AdaptadorLista2(Seriesmomento.this, R.layout.seriesmomento_item, series_momento);
        listaSeries2.setAdapter(adaptador2);
 
        
        listaSeries2.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
 
              // item seleccionado
        	  //intentString = series_momento[position];
 
              
        	  Intent i = new Intent(Seriesmomento.this, Series_momento_lista.class);
              //   envio de datos a la otra Activity
               //i.putExtra("product", intentString);
               i.putExtra("POSITION2", position);
                startActivity(i);
          }
        });
        
        buscador2.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				Seriesmomento.this.adaptador2.getFilter().filter(arg0.toString());
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }
    
    class AdaptadorLista2 extends ArrayAdapter<String>{
    	Activity context;
    	int layoutResource;
    	String[] array;
    	
    	AdaptadorLista2(Activity context, int layoutResource, String[] array){
    		super(context, layoutResource, array);
    		this.context = context;
    		this.layoutResource = layoutResource;
    		this.array = array;
    	}
    	
    	public View getView(int position, View convertView, ViewGroup parent){
			LayoutInflater inflater = getLayoutInflater();
			View item = inflater.inflate(R.layout.seriesmomento_item, null);
			
			TextView texto = (TextView)item.findViewById(R.id.listView_item_seriesmomento);
			texto.setText(array[position]);
			
    		return (item);
    		
    	}

		
		}
    }
