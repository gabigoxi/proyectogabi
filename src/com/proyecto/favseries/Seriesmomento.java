package com.proyecto.favseries;



import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
 

public class Seriesmomento extends Activity {
	private ListView listaSeries2;
	AdaptadorLista2 adaptador2;
	String intentString;
	FavSeriesApplication arraySeries2[];
    private final String BUNDLE2 = "Bundle2";
	
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.seriesmomento);
             
        listaSeries2 = (ListView)findViewById(R.id.listview2);
        
        arraySeries2 = FavSeriesApplication_Objects.arrayObjetos2(getApplicationContext());
        
        adaptador2 = new AdaptadorLista2(Seriesmomento.this, R.layout.seriesmomento_item, arraySeries2);
        listaSeries2.setAdapter(adaptador2);
 
        
        listaSeries2.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
          	  FavSeriesApplication objeto2 = (FavSeriesApplication)adaptador2.getItem(position);
          	  Bundle bundle = new Bundle();
                Intent i = new Intent(Seriesmomento.this, Series_momento_lista.class);
               //envio de datos a la otra Activity
                bundle.putParcelable(BUNDLE2, objeto2);
                i.putExtras(bundle);
                startActivity(i);
                
            }
            
        });
        
   }
    
    class AdaptadorLista2 extends ArrayAdapter<FavSeriesApplication>{
    	Activity context;
    	int layoutResource;
    	FavSeriesApplication[] array2;
    	
    	AdaptadorLista2(Activity context, int layoutResource, FavSeriesApplication[] array2){
    		super(context, layoutResource, array2);
    		this.context = context;
    		this.layoutResource = layoutResource;
    		this.array2 = array2;
    	}
    	
    	public View getView(int position, View convertView, ViewGroup parent){
			LayoutInflater inflater = getLayoutInflater();
			View item = inflater.inflate(R.layout.seriesmomento_item, null);
			
			ImageView bannerlista = (ImageView)item.findViewById(R.id.bannerlista);
			bannerlista.setImageResource(array2[position].getBanner());
			
    		return (item);
    		
    	}

		
		}
    }
