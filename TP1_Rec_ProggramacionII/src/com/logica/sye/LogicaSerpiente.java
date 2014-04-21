package com.logica.sye;

import com.sye.Casillero;



public final class LogicaSerpiente extends LogicaCasillero {
	 private int transportar ;
	
	 public LogicaSerpiente (Casillero s, int t) {
		 super (s);
		 assert t <0 : "el retroceso debe ser hacia atras " ;
		 transportar = t;
	
	 }
	
	 @Override
	 public Casillero posicionarORetroceder () {
	 System . out. println ("PISO COLA de serpiente :( retrocede desde " + ( casillero . getPosicion ()+1)
	 + " hasta " + ( destino (). getPosicion ()+1));
	 return destino ().posicionarORetroceder();
	 }
	 private Casillero destino() {
		  return casillero.encontrarCasilleroRelativo( transportar );
	  }

	 
	
}