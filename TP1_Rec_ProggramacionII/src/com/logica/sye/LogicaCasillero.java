package com.logica.sye;

import com.sye.Casillero;


public class LogicaCasillero{
	 protected Casillero casillero = null ;	
	 private boolean fin = false ;
	
	 public LogicaCasillero (Casillero s) {
	 assert s!= null;
	 casillero = s;
	 } 

	 public Casillero moverHastaNuevaPosicion (int tiro ) {	
		  int ultimaPosicion = casillero.encontrarUltimoCasillero().getPosicion();
		  int posicionActual = casillero.getPosicion();
		  if ( posicionActual + tiro > ultimaPosicion) {
			  System . out. println ("Deberia ir al casillero "
					  + ( posicionActual + tiro +1)
					  + " pero el tamanio del tablero es " + ( ultimaPosicion +1)+"\n");			 
			  fin = true;			  
			  return casillero ;
		  }
		  else {
			  System.out.println ("se mueve del " + ( casillero . getPosicion ()+1) + " al "		 
					  + ( casillero.encontrarCasilleroRelativo(tiro).getPosicion ()+1)+"\n");
			  System.out.println("***** *****");
			  
			  return casillero.encontrarCasilleroRelativo(tiro).posicionarORetroceder();
		  }
	 }
	 
	 public Casillero posicionarORetroceder() {
		  return casillero;
		  //return casillero.estaOcupado () ? casillero.encontrarPrimerCasillero() : casillero;
		  }
	 
	 
	 public boolean esUltimoCasillero () {
		 return fin ;
	 } 
}

