package com.proyecto.favseries;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
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
import android.widget.ListView;
import android.widget.TextView;
 
public class Buscador extends Activity {
    
	private ListView listaSeries;
	private EditText buscador;
	AdaptadorLista adaptador;
    String intentString;   
    String buscar_series;
    
    FavSeriesApplication arraySeries[];
    private final String BUNDLE = "Bundle";
    List<FavSeriesApplication> arrayList = new ArrayList<FavSeriesApplication>();
     
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.buscarserie);
        
      /*  String[] arrayItems = new String[3];
        
                arrayItems[0] = "Anatomía de Grey"; arrayItems[1] = "Arrow"; arrayItems[2] = "Bones"; arrayItems[3] = "Breaking Bad";
                arrayItems[4] = "Cálico Electrónico";arrayItems[5] = "Castle";arrayItems[6] = "Como conoci a vuestra madre";arrayItems[7] = "Dexter";arrayItems[8] = "Dos Hombres y Medio";
                arrayItems[9] = "El equipo A";arrayItems[10] = "Érase una vez";arrayItems[11] = "Family Guy";arrayItems[12] = "Friends";arrayItems[13] = "Fringe";
                arrayItems[14] = "Futurama";arrayItems[15] = "Gossip Girl";arrayItems[16] = "Heidi";arrayItems[17] = "Homeland";arrayItems[18] = "House";
                arrayItems[19] = "Imperium";arrayItems[20] = "Jericho";arrayItems[21] = "Juego de Tronos";arrayItems[22] = "Kim Possible";arrayItems[23] = "Los Simpson";
                arrayItems[24] = "Mentes Criminales";arrayItems[25] = "Modern Family";arrayItems[26] = "Mujeres Desesperadas";arrayItems[27] = "Naruto";arrayItems[28] = "Revenge";
                arrayItems[29] = "South Park";arrayItems[30] = "Spartacus";arrayItems[31] = "Supernatural";arrayItems[32] = "The Big Bang Theory";arrayItems[33] = "The Mentalist";
                arrayItems[34] = "The Waling Dead";
                
                
                
                
         
          List<String> lista = Arrays.asList(arrayItems);*/


    FavSeriesApplication[] array = FavSeriesApplication_Objects.arrayObjetos(getApplicationContext());
    	for (int i = 0; i < array.length ; i ++){
    		FavSeriesApplication serie  = array[i];
    		
    		arrayList.add(serie);
    	}

     // String
        listaSeries = (ListView)findViewById(R.id.listviewbuscar);
        buscador = (EditText)findViewById(R.id.buscador);
        
        arraySeries = FavSeriesApplication_Objects.arrayObjetos(getApplicationContext());
        adaptador = new AdaptadorLista(Buscador.this, R.layout.buscar_item, arrayList);
        
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
        	  FavSeriesApplication objeto = (FavSeriesApplication)adaptador.getItem(position);
        	  Bundle bundle = new Bundle();
              Intent i = new Intent(Buscador.this, Buscar_serie_lista.class);
             //envio de datos a la otra Activity
              bundle.putParcelable(BUNDLE, objeto);
              i.putExtras(bundle);
              startActivity(i);
              
            
          }
          
          
        });
        
}
   
    
   class AdaptadorLista extends ArrayAdapter<FavSeriesApplication>{
    	Activity context;
    	int layoutResource;
    	List<FavSeriesApplication> array;
    	
    	AdaptadorLista(Activity context, int layoutResource, List<FavSeriesApplication>  array){
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
			texto.setText(array.get(position).getNombre());
			
    		return (item);
    		
    	}

    }
}