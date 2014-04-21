package com.ejercicio1;
import java.util.ArrayList;

public class Mochila {	
	int [] elemtMochila;
	int pesoMochila;
	
	/**
	 * 
	 * @param Lista de elementos 
	 * @param Peso maximo
	 */
	public Mochila (int[] elem, int pesomax){
		elemtMochila= elem;
		pesoMochila= pesomax;
	}

	public ArrayList<ArrayList<Integer>> resolver_1a() {
		@SuppressWarnings("unused")
		ArrayList<ArrayList<Integer>> solucion= Mochila1a.llenarMochila(elemtMochila, pesoMochila);
		return null;
	}

	public ArrayList<ArrayList<Integer>> resolver_1b() {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> solucion= Mochila1b.llenarMochila(elemtMochila, pesoMochila);
		return solucion;
	}
}
