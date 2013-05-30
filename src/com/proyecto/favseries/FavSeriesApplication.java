package com.proyecto.favseries;

import android.app.Application;


public class FavSeriesApplication extends Application {

	private String[] mSeriesbuscar, mSeriesmomento, mSinopsisbuscar, mSinopsismomento;


	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mSeriesbuscar = getResources().getStringArray(R.array.buscar_series);
		mSeriesmomento = getResources().getStringArray(R.array.series_momento);
		mSinopsisbuscar = getResources().getStringArray(R.array.sinopsisbuscar);
		mSinopsismomento = getResources().getStringArray(R.array.sinopsismomento);
	}
	public String[] getSeriesbuscar() {
		return this.mSeriesbuscar;
		
	}
	
	public String[] getSeriesmomento() {
		return this.mSeriesmomento;
		
	}

	public String[] getSinopsisbuscar() {
		return this.mSinopsisbuscar;
	}
	
	public String[] getSinopsismomento() {
		return this.mSinopsismomento;
	}
	
}
