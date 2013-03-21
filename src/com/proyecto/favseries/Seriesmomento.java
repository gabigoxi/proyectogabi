package com.proyecto.favseries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;

import android.widget.TextView;

public class Seriesmomento extends Principaldos{
	
	private ListView lv;
    private String listview_array[] = { 
    		"Juego de Tronos", 
    		"Como conoci a vuestra madre", 
    		"The Big Bang Theory", 
    		"House", 
    		"Gossip Girl", 
    		"Modern Family",
            "Revenge", 
            "Mujeres Desesperadas", 
            "Family Guy", 
            "Supernatural" };
    
 // Array of integers points to images stored in /res/drawable-ldpi/
    private int[] seriesfotos = {
        R.drawable.tronos
        
    };
    

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seriesmomento);
		

		lv = (ListView) findViewById(R.id.listview2);
		lv.setAdapter(new ArrayAdapter<String>(this,
		android.R.layout.simple_list_item_1, listview_array));
		lv.setTextFilterEnabled(true);
		lv.setOnItemClickListener(new OnItemClickListener()
		{
		public void onItemClick1(AdapterView<?> arg0, View v, int position, long id)
		{
		AlertDialog.Builder adb = new AlertDialog.Builder(
		Seriesmomento.this);
		adb.setTitle("ListView OnClick");
		adb.setMessage("Selected Item is = "
		+ lv.getItemAtPosition(position));
		adb.setPositiveButton("Ok", null);
		adb.show();                     
		                                                }

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
        }
        });
}
}


