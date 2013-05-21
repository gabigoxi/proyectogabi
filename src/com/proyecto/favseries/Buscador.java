package com.proyecto.favseries;

import java.util.ArrayList;
import java.util.HashMap;

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
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
 
public class Buscador extends Activity {
    
	private ListView listaSeries;
	private EditText buscador;
	AdaptadorLista adaptador;
    String intentString;
    String[] buscar_series;
   // ArrayList<HashMap<String, String>> productList;
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscarserie);
        
     // String
        buscar_series = getResources().getStringArray(R.array.buscar_series);
        listaSeries = (ListView)findViewById(R.id.listviewbuscar);
        buscador = (EditText)findViewById(R.id.buscador);
        
        adaptador = new AdaptadorLista(Buscador.this, R.layout.buscar_item, buscar_series);
        listaSeries.setAdapter(adaptador);
        
        buscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Buscador.this.adaptador.getFilter().filter(cs.toString());
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
     
    
    
	 listaSeries.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
 
        	  
              // item seleccionado
             intentString = buscar_series[position];
             
              
              Intent i = new Intent(Buscador.this, Buscar_serie_lista.class);
            //   envio de datos a la otra Activity
             i.putExtra("product", intentString);
             startActivity(i);
              
            
          }
          
          
        });
        
}

    
   class AdaptadorLista extends ArrayAdapter<String>{
    	Activity context;
    	int layoutResource;
    	String[] array;
    	
    	AdaptadorLista(Activity context, int layoutResource, String[] array){
    		super(context, layoutResource, array);
    		this.context = context;
    		this.layoutResource = layoutResource;
    		this.array = array;
    	}
    	
    	@Override
    	public View getView(int position, View convertView, ViewGroup parent){
			LayoutInflater inflater = context.getLayoutInflater();
			View item = inflater.inflate(R.layout.buscar_item, null);
			
			TextView texto = (TextView)item.findViewById(R.id.listView_item_busqueda);
			texto.setText(array[position]);
			
    		return (item);
    		
    	}

    }
}
        