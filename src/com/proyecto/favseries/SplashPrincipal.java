package com.proyecto.favseries;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


	public class SplashPrincipal extends Activity {
	    private static final int SPLASH_TIME = 5 * 2000;// 3 seconds
	 
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.splash);
	        try {
	        new Handler().postDelayed(new Runnable() {
	 
	            public void run() {
	                 
	                Intent intent = new Intent(SplashPrincipal.this,
	                    Principaldos.class);
	                startActivity(intent);
	 
	                SplashPrincipal.this.finish();    
	 
	            }
	             
	             
	        }, SPLASH_TIME);
	         
	        new Handler().postDelayed(new Runnable() {
	              public void run() {
	                     } 
	                }, SPLASH_TIME);
	        } catch(Exception e){}
	    }
	 
	     
	    @TargetApi(Build.VERSION_CODES.ECLAIR) @Override
	    public void onBackPressed() {
	        this.finish();
	        super.onBackPressed();
	    }
	}
