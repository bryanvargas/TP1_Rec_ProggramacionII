package com.ejercicio1;
import java.util.ArrayList;

public class Mochila1b{

	NodoMochila Raiz;
	
	//Constructor
	public Mochila1b(){
		Raiz = null;
	}
	
	//Insercion de un elemento dentro de la Mochila
	public void insertaNodo(int Elem){		
		ArrayList<Integer> lista= new ArrayList<Integer>();
		if(Raiz == null){
			Carga carga = new Carga (Elem, "raiz", lista);
			Raiz = new NodoMochila(carga);}
		else
			Raiz.insertar(Elem);
	}
	
	//Preorden Recursivo del arbol
	public ArrayList<ArrayList<Integer>> preorden (NodoMochila Nodo, int pesoMax, int nodoFinal){
		
		ArrayList<ArrayList<Integer>> solucion= new ArrayList<ArrayList<Integer>>();
		if(Nodo == null)
			return null;
		else{
			//System.out.print (Nodo.dato.valor + " ");
			if (Nodo.dato.valor==nodoFinal && Nodo.dato.suma()==pesoMax){
				System.out.println(Nodo.dato.lista.toString());
				solucion.add(Nodo.dato.lista);}
			preorden (Nodo.Hizq, pesoMax, nodoFinal);
			preorden (Nodo.Hder, pesoMax, nodoFinal);
		return solucion;
		}
	}
	
	
	
	//cantidad de niveles que posee el arbol
	public int altura (NodoMochila Nodo){ 
		if (Nodo==null)
	         return -1;
	    else
	         return 1+Math.max(altura(Nodo.Hizq),altura(Nodo.Hder));
		}
	
	//cantidad de elementos que posee el arbol	
	public int tamaño (NodoMochila Nodo){
	    if (Nodo==null)
	       return 0;
	    else
	      return 1+tamaño(Nodo.Hizq)+tamaño(Nodo.Hder);
  }
	public static ArrayList<ArrayList<Integer>> llenarMochila(int[] elementos, int pesoMax){
		
		Mochila1b elementosMochila= new Mochila1b();
		int nodoFinal= 0;
		for (int i = 0; i < elementos.length; i++) {
			if ((i+1)!=elementos.length)
				elementosMochila.insertaNodo(elementos[i]);
			else{
				elementosMochila.insertaNodo(elementos[i]);
				elementosMochila.insertaNodo(elementos[i]+1);
				nodoFinal= elementos[i]+1;
			}
		}
		ArrayList<ArrayList<Integer>> solucion = elementosMochila.preorden(elementosMochila.Raiz, pesoMax, nodoFinal);
		return solucion;
	}
}