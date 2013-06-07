package com.proyecto.favseries;

import android.os.Parcel;
import android.os.Parcelable;


public class FavSeriesApplication implements Parcelable{
	String nombre; 
	String sinopsis;
	int banner;
	String[] spinnertemporadas;
	String[] spinnercapitulos;

	
	public FavSeriesApplication(String nombre, String sinopsis, int banner,
			String[] spinnertemporadas, String[] spinnercapitulos) {
		super();
		this.nombre = nombre;
		this.sinopsis = sinopsis;
		this.banner = banner;
		this.spinnertemporadas = spinnertemporadas;
		this.spinnercapitulos = spinnercapitulos;
	}
	
	
	public FavSeriesApplication(Parcel in){
		readFromParcel(in);
	}


	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(nombre);
		dest.writeString(sinopsis);
		dest.writeInt(banner);
		dest.writeStringArray(spinnertemporadas);
		dest.writeStringArray(spinnercapitulos);
		

	}

	private void readFromParcel(Parcel in) {
		nombre = in.readString();
		sinopsis = in.readString();
		banner = in.readInt();
		spinnertemporadas = in.createStringArray(); 
		spinnercapitulos = in.createStringArray();
		
	}

   @SuppressWarnings("rawtypes")
   public static final Parcelable.Creator CREATOR =
   	new Parcelable.Creator() {
           public FavSeriesApplication createFromParcel(Parcel in) {
               return new FavSeriesApplication(in);
           }

           public FavSeriesApplication[] newArray(int size) {
               return new FavSeriesApplication[size];
           }
    };


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getSinopsis() {
	return sinopsis;
}


public void setSinopsis(String sinopsis) {
	this.sinopsis = sinopsis;
}


public int getBanner() {
	return banner;
}


public void setBanner(int banner) {
	this.banner = banner;
}


public String[] getSpinnertemporadas() {
	return spinnertemporadas;
}


public void setSpinnertemporadas(String[] spinnertemporadas) {
	this.spinnertemporadas = spinnertemporadas;
}


public String[] getSpinnercapitulos() {
	return spinnercapitulos;
}


public void setSpinnercapitulos(String[] spinnercapitulos) {
	this.spinnercapitulos = spinnercapitulos;
}

	

	
	
	
}
