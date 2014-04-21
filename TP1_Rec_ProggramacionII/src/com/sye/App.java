package com.sye;

public final class App {
	
	public static void main ( String [] args ) {
		
		SyE sye = new SyE(30, 2, 5);
		//nombre jugadores XP
		String [] nombreJugadores = {"Bryan Vargas", "Alejandro Catacata"};
		int [][] serpientes = { {11 ,5} };
		int [][] escaleras = { {2 ,6} , {7 ,9} };
			
		//se agrega un matriz de escaleras y serpientes
		sye.agregarEscaleras(escaleras);
		sye.agregarSerpientes(serpientes);
		
		sye.crearJugadores(nombreJugadores);
		while(sye.ganador()==""){
			sye.jugar ();		
		}		
		
		System.out.println("*****************************");
		System.out.println ("* "+sye.ganador() + " HA GANADO!!! *");
		System.out.println("*****************************");
 	}
}