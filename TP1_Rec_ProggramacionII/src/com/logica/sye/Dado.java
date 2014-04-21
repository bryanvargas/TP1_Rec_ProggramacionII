package com.logica.sye;

public class Dado {
	 private static final int MINVALUE = 1;
	 //private static final int MAXVALUE = 6;
	 private int valorTope;
	 
	 public Dado(int valor) {
		 if(valor < 1)
			 throw new RuntimeException("EL valor ingresado no es valido");
		 System.out.println("El valor del dado es: "+ valor);
		 System.out.println("*******************");
		 this.valorTope = valor;
	 }	 

	 public int tiro() {		 
		 return aleatorio ( MINVALUE , valorTope );
	 }

	 private int aleatorio (int min , int max ) {
		 assert min < max;		 
		 return (int)( min + Math.round (( max - min) * Math.random ()));
	 	}
	 }