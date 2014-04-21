package com.ejercicio1;
import java.util.ArrayList;


public class Test {
	
	public static void Testeo1(){
		int[] elementos= {1,2,3,4,5};
		Mochila mochila = new Mochila(elementos,10);
		@SuppressWarnings("unused")
		ArrayList<ArrayList<Integer>> solucion;
		System.out.println("La solucion al Test1 mochila.resolver_1a() es");
		solucion = mochila.resolver_1a();
		System.out.println("La solucion al Test1 mochila.resolver_1b() es");
		solucion = mochila.resolver_1b();
		/*
		solución = ({2,3,5},{1,2,3,4},{1,4,5})
		mochila.resolver_1b()debe devolver lo mismo que mochila.resolver_1a().
		*/
		
	}
	public static void Testeo2(){
		int[] elementos= {1,2,3,4,7,8,10,12,35,57,68};
		Mochila mochila2 = new Mochila(elementos,30);
		@SuppressWarnings("unused")
		ArrayList<ArrayList<Integer>> solucion2;
		System.out.println("La solucion al Test2 mochila.resolver_1a() es");
		solucion2 = mochila2.resolver_1a();
		System.out.println("La solucion al Test2 mochila.resolver_1b() es");
		solucion2 = mochila2.resolver_1b();
		/*
		mochila2.resolver_1a() debe devolver lo mismo que mochila2.resolver_1b().
		{{2,3,7,8,10},{1,4,7,8,10},{1,2,3,4,8,12},{1,2,7,8,12},{3,7,8,12},
		{1,3,4,10,12},{1,7,10,12},{8,10,12}}
		*/
	}
	public static void Testeo3(){
		
		int[] extenso = new int[5];
		for (int i = 0; i < extenso.length; i++)
			extenso[i] = i;
		
		Mochila mochilaGrande = new Mochila (extenso, 10);
		
		@SuppressWarnings("unused")
		ArrayList<ArrayList<Integer>> solucion3;
		System.out.println("La solucion al Test3 mochilaGrande.resolver_1a() es");
		solucion3 = mochilaGrande.resolver_1a();
		System.out.println("La solucion al Test3 mochilaGrande.resolver_1b() es");
		solucion3 = mochilaGrande.resolver_1b();
		
	}
	public static void main(String[] args) {
		
		Testeo1();
		Testeo2();
		Testeo3();
		


	}

}
