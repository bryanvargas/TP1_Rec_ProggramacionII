package com.ejercicio1;
import java.util.ArrayList;

public class NodoMochila{
	Carga dato;
	NodoMochila Hizq, Hder;
	
	//Constructor
	public NodoMochila (Carga carga){
		dato = carga;
	}
	
	//Inserta elemento, para cada rama crea un arrayList nuevo
	//con los elementos segun se vayan agregando o no a la mochila.	
	@SuppressWarnings("unchecked")
	public void insertar(int Elem){
		//Se copia el ArrayList original para agregar elemento segun sea la rama
		//a la que pertenezca.
		ArrayList<Integer> lder= new ArrayList<Integer>();
		ArrayList<Integer> lizq= new ArrayList<Integer>();		
		lder=  (ArrayList<Integer>) dato.lista.clone();
		lizq=  (ArrayList<Integer>) dato.lista.clone();
		
		//Si las ramas estan vacias crean dos nodos nuevos con los ArrayList 
		if (Hizq == null && Hder == null){
			Carga cizq= new Carga (Elem, "izq", lizq);
			Carga cder= new Carga (Elem, "der", lder);
			Hizq = new NodoMochila(cizq);
			Hder = new NodoMochila(cder);
			//Si es rama derecha se agrega el elemento Raiz para que forme parte del
			//contenido de la mochila.
			Hder.dato.lista.add(dato.valor);}
			//dato.lista= null;			
			//System.out.println(dato.valor+" "+dato.rama);
			//System.out.println("Posc Arbol "+Hizq.dato.rama+" Valor "+cizq.valor+" lista"+Hizq.dato.lista.toString());
			//System.out.println("Posc Arbol "+Hder.dato.rama+" Valor "+cder.valor);}
		//Si las ramas de los Nodos no estan vacias envia cada Nodo y el Elemento
		//para insertarlo cuando encuentre un Nodo vacio.
		else{
			Hizq.insertar(Elem);
			Hder.insertar(Elem);}
				//Hizq.insertar(Elem);
				//System.out.println("Raiz "+dato+" "+Elem);}
		
	}
}