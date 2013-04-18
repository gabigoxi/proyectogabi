package com.proyecto.favseries;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
 
public class Seriesmomento extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        // String
        String[] series_momento = getResources().getStringArray(R.array.series_momento);
 
        // ArrayList
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.seriesmomento_item, R.id.label, series_momento));
 
        ListView lv = getListView();
 
        // 
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
 
              // item seleccionado
              String product = ((TextView) view).getText().toString();
 
              
              Intent i = new Intent(getApplicationContext(), Series_momento_lista.class);
              // envio de datos a la otra Activity
              i.putExtra("product", product);
              startActivity(i);
 
          }
        });
    }
}


