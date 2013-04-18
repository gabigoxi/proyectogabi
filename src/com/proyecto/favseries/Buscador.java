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
 
public class Buscador extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
 
        // String
        String[] buscar_series = getResources().getStringArray(R.array.buscar_series);
 
        // ArrayList
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.buscar_item, R.id.label2, buscar_series));
 
        ListView lv = getListView();
 
        // 
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
 
              // item seleccionado
              String product = ((TextView) view).getText().toString();
 
              
              Intent i = new Intent(getApplicationContext(), Buscar_serie_lista.class);
              // envio de datos a la otra Activity
              i.putExtra("product", product);
              startActivity(i);
 
          }
        });
    }
}