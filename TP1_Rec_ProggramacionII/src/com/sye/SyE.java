package com.sye;


import java.util.LinkedList;

import com.logica.sye.Dado;


public final class SyE {
	 private LinkedList<Jugador> jugadores = new LinkedList<Jugador>();	 
	 private Tablero tablero = null ;
	 private String jugadorGanador = "";
	 private int valorDado;
	 
	 /**
	  * 
	  * @param numCasilleros
	  * @param cantidadJugadores
	  * @param valorDado
	  */
	 public SyE (int numCasilleros,int cantidadJugadores, int valorDado) {
		 this.valorDado = valorDado;
		crearTablero(numCasilleros);	
		
	 }	 
	 
	 public void setValorDado(int valorDado) {
		this.valorDado = valorDado;
	}
	 public int getValorDado() {
		return valorDado;
	}

	 public void crearTablero (int numCasilleros ) {
		 tablero = new Tablero ( numCasilleros );
	 }
	 
	 public void agregarSerpientes(int [][] serpientes) {	
		tablero.crearSerpientes(serpientes);																										
	 }
	 
	 public void agregarEscaleras(int[][] escaleras) {
		tablero.crearEscaleras(escaleras);			
	 }
	 
	 public void crearDado(int lon){
		 
	 }

	 public void crearJugadores (String [] nombreJugadores ) {
		 assert nombreJugadores . length >1 : "Debe tener dos jugadores como minimo" ;
		 System.out.println ("Los jugadores son: ");
		 int i=1;
		 for ( String str : nombreJugadores ) {
			 Jugador jugador = new Jugador(str);
			 jugadores.add( jugador );
			 System . out. println (i + ". " + str );
			 i++;	
		 }
		 System.out.println("****************");
	 }	 
	 
	 public void posicionarJugadoresAlComienzoJuego() {
		 for ( Jugador jugador : jugadores ) {
			 tablero.primerCasillero().ingresarACasillero(jugador);
		 }
	 }	 

	 public void comenzarJuego () {
		 posicionarJugadoresAlComienzoJuego ();
		 jugadorGanador = "" ;
	}
	 
	 public boolean finalizado() {
		 return jugadorGanador == "";
	 }	
	 
	 public void jugar () {
		 assert ! jugadores . isEmpty () : "No hay jugadores para jugar";
		 assert tablero != null : "no hay tablero para jugar";
		 
		 Dado dado = new Dado (getValorDado());
		 comenzarJuego ();
	
		 System.out.println("Estado inicial : \n" + this+"\n");		 
		 int i = 0;
		 while(i<1000 && finalizado()){				
			 int tiro = dado.tiro();			
			 System.out.println("El jugador actual es: " + jugadorActual()
					 + " y el tiro del dado es " + tiro );	
			 moverJugador(tiro);
			
			 System.out.println("Estado actual: \n" + this +"\n");	
			 i++;
		
		 }
	 }
	 
	 public void moverJugador (int tiro ) {			
		 Jugador jugadorActual = jugadores.remove(); 
		 jugadorActual.avanzar (tiro);			 
		 jugadores.add(jugadorActual);		
		 if (jugadorActual.wins ()) {		
			 jugadorGanador = jugadorActual.getNomJugador();
		 }
	}	 

	public String ganador() {			
		return this.jugadorGanador;
	}
	
	 private Jugador jugadorActual () {
		 assert jugadores.size () >0;
		 return jugadores.peek ();
	 }


	
	 @Override
	 public String toString () {
		 String str = new String ();
		 for ( Jugador jugador : jugadores ) {
			 str += jugador.getNomJugador()+ " esta en el casillero "
			 + ( jugador . posicion ()+1) + "\n";
		 }
	
		 return str;		
	 	}
	 
}