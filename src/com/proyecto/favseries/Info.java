package com.proyecto.favseries;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_item_buscar);
        
        TextView text = (TextView)findViewById(R.id.textViewInfo);
        
        String[] myStringArray = getResources().getStringArray(R.array.info);
        String textOut = "";
        
        for(int i = 0; i < myStringArray.length; i++){
         textOut += myStringArray[i] + "\n";
        }
        
        text.setText(textOut);
    }
}