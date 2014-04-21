package com.sye;

import java.util.ArrayList;
import com.logica.sye.LogicaCasillero;
import com.logica.sye.LogicaEscalera;
import com.logica.sye.LogicaSerpiente;

public final class Tablero {	
	 private ArrayList <Casillero > casilleros = new ArrayList <Casillero >();
	 private static int MINNUMCASILLeros = 10;

	 
	 public Tablero (int numCasillero) {
	
	 assert numCasillero > MINNUMCASILLeros : " Debe ser mayor a 10 "
	 + MINNUMCASILLeros + " casilleros ";
	 crearCasilleros ( numCasillero );

	 }
	
	 public void crearCasilleros (int numCasilleros ) {
		 System .out . println ("Hay: " + numCasilleros + " casilleros");
		 System.out.println("*******************");
		 for (int posicion =0 ; posicion < numCasilleros ; posicion ++) {
			 Casillero casillero = new Casillero ( posicion , this );
			 casilleros.add(casillero);
			 //asigna a cada casillero su comportamiento
			 casillero.setLogicaCasillero(new LogicaCasillero(casillero));			
		 }
	 }
	 
	 public void crearSerpientes(int [][] serpientes ) {
		 for (int i=0; i< serpientes . length ; i++) {
			 assert serpientes [i]. length == 2;			
			 int posicionDesde = serpientes [i ][0] -1;
			 int posicionHasta = serpientes [i ][1] -1;
			 int transportar = posicionHasta - posicionDesde ;			
			 System . out. println ("serpiente desde " + ( posicionDesde +1)
			 + " hasta " + ( posicionHasta +1));
			 System.out.println("*******************");			
			 Casillero casilleroSerpiente = casilleros.get(posicionDesde);
			 //asigna a cada casillero su comportamiento-
			 LogicaSerpiente l = new LogicaSerpiente(casilleroSerpiente, transportar);
			 casilleroSerpiente.setLogicaCasillero (l);			 
		 	}
		 }
	
	 public void crearEscaleras(int [][] escaleras ) {
		 for (int i=0; i< escaleras . length ; i++) {
			 assert escaleras [i]. length == 2;			
			 int posicionDesde = escaleras [i ][0] -1;
			 int posicionHasta = escaleras [i ][1] -1;			
			 int transportar = posicionHasta - posicionDesde ;			
			 System . out. println ("Escalera desde " + ( posicionDesde +1)
			 + " hasta " + ( posicionHasta +1));			
			 Casillero casilleroEscalera = casilleros.get( posicionDesde );
			 //asigna a cada casillero su comportamiento
			 casilleroEscalera.setLogicaCasillero ( new LogicaEscalera ( casilleroEscalera , transportar ));
			 }
		 }
		 
	
	 public Casillero primerCasillero () {
		 return casilleros.get(0);
	 }
	
	 public Casillero ultimoCasillero () {
		
		 return casilleros.get(casilleros.size()-1);
	 }
	
	
	 public Casillero iesimoCasillero(int posicion) { 

		 return casilleros.get(posicion);
	 }
	 
	 public int sizeTablero(){
		 return casilleros.size();
	 }	 

}



