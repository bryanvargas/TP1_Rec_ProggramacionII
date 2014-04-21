package com.sye;

import com.logica.sye.LogicaCasillero;



public class Casillero {
	 private Tablero tablero = null ;
	 private Jugador jugador = null ;
	 private int posicion ;
	 private LogicaCasillero logicaCasillero = null ;

	/**
	 * 
	 * @param posicion
	 * @param b
	 */
	 public Casillero ( int posicion , Tablero b) {
		 //assert pos >=0 : "El numero de casilleros debe ser >= a cero " ;
		 this.posicion = posicion;
		 tablero = b;
	 }
	
	 public Jugador getJugador () {
		 return jugador ;
	 }
	
	 public void setJugador ( Jugador p) {
		 jugador = p;
	 }

	 public int getPosicion () {
		 return posicion ;
	 }
	
	 public void setLogicaCasillero(LogicaCasillero sr) {
		 assert sr != null ;
		 logicaCasillero = sr;
	 }	

	 public boolean estaOcupado(){
		 return getJugador()!=null;
	 }
	 public boolean esUltimoCasillero() {
		 return logicaCasillero.esUltimoCasillero();
	 }
	
	 public Casillero moverYPosicionar(int tiro) {	
		 return logicaCasillero.moverHastaNuevaPosicion(tiro);
	 }
	
	 public Casillero posicionarORetroceder () {
		 return logicaCasillero.posicionarORetroceder ();
	
	 }
	 
	 public void ingresarACasillero(Jugador p){
		 setJugador(p);
		 jugador.setCasillero(this);
	 }	

	public void abandonarCasillero(){
		setJugador(null);
	}
	
	 public Casillero encontrarCasilleroRelativo(int tiro ) {
		return tablero.iesimoCasillero( posicion + tiro );
	}	

	
	 public Casillero encontrarUltimoCasillero () {		 
		 return tablero.ultimoCasillero();
	 }
	 
	 public String salida(){
		 return logicaCasillero.toString();
	 }


	 
}

