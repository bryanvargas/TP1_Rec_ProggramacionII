package com.ejercicio1;
import java.util.ArrayList;

public class Carga {
	int valor;
	String rama;
	ArrayList<Integer> lista;
	
	public Carga (int val, String ram, ArrayList<Integer> list){
		
		valor= val;
		rama= ram;
		lista= list;		
	}

	public int suma() {
		
		int suma= 0;
		for (int i = 0; i < this.lista.size(); i++) {
			suma+= lista.get(i);			
		}

		return suma;
	}

}
