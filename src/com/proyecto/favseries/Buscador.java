package com.proyecto.favseries;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Buscador extends Principaldos {
	
	
	private ListView lv;
	private EditText et;
	private String listview_array[] = { 
			"Anatomía de Grey", 
			"Bones", 
			"Cálico Electrónico",
			"Como conoci a vuestra madre", 
			"Dexter", 
			"El Equipo A",
			"Family Guy",
			"Friends", 
			"Glee",
			"Gossip Girl",
			"Heidi", 
			"House",
			"Imperium", 
			"Jericho",
			"Juego de Tronos", 
			"Kim Possible",
			"La Familia Addams",
			"Modern Family",
			"Mujeres Desesperadas",
			"Naruto",
			"Revenge", 
			"Supernatural",
			"The Big Bang Theory" };
	
	
	
	private ArrayList<String> array_sort= new ArrayList<String>();
	int textlength=0;

	public void onCreate(Bundle savedInstanceState){
		getWindow().setSoftInputMode(
			      WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	super.onCreate(savedInstanceState);
	setContentView(R.layout.buscarserie);
	
	

	lv = (ListView) findViewById(R.id.listview);
	et = (EditText) findViewById(R.id.buscador);
	lv.setAdapter(new ArrayAdapter<String>(this,
	android.R.layout.simple_list_item_1, listview_array));

	et.addTextChangedListener(new TextWatcher(){
		
	public void afterTextChanged(Editable s){
	                                                                
	}
	
	public void beforeTextChanged(CharSequence s,int start, int count, int after){
		}
	
	public void onTextChanged(CharSequence s,int start, int before, int count)
	{
		
	textlength = et.getText().length();
	array_sort.clear();
	for (int i = 0; i < listview_array.length; i++){
	if (textlength <= listview_array[i].length()){
	if(et.getText().toString().equalsIgnoreCase((String)listview_array[i].subSequence(0,
	textlength)))
	{
	                                                                                                                
		array_sort.add(listview_array[i]);
 }
	}
	    }
	lv.setAdapter(new ArrayAdapter<String>(Buscador.this,android.R.layout.simple_list_item_1, array_sort));
	}
	});
	}
	}