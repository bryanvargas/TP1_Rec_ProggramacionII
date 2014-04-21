package com.ejercicio1;
import java.util.ArrayList;

public class Mochila1a {
	private int n;
	private int [][] soluciones;
	private int nn;
	private final int BASE_n = 2;
	
	public Mochila1a(int n){		
		this.n = n;
		this.nn = potenciaRec(n);
		soluciones =new  int [nn][n];
	}
	/**
	 * 
	 * @return devuelve una Matriz Binaria
	 */
	public int[][] matrixBinario(){
		int altura = potenciaRec(n);
		int pivote = altura/2;
		int  iteradorBinario= 0;
		int numeroBinario = 0; // pertececiente a (0, 1)
		for (int j = 0; j < n; j++) {
			for (int i = 0; i< altura; i++) {
				if(numeroBinario == 0){
					soluciones[i][j]=0;
					iteradorBinario++;
				}
				else{
					soluciones[i][j]=1;
					iteradorBinario--;
				}
				if(iteradorBinario==pivote)
					numeroBinario = 1;
				if(iteradorBinario==0)
					numeroBinario = 0;			
			}
			pivote /=2;			
		}	
		return soluciones;
		
	}
	
	/**
	 * 
	 * @param matriz Binaria
	 * @param elementos de la tMochila
	 * @param peso de la Mochila
	 */
	public void solucionesFuerzaBruta(int[][] matrizBinaria,
				int[] elemtMochila,int pesoMochila) {
		int peso = 0;
		int base= elemtMochila.length;
		int altura= potenciaRec(n);
		ArrayList<Integer> aux = new ArrayList<Integer>();
		for (int i = 0; i < altura; i++) {
			aux.clear();
			peso= 0;
			for (int j = 0; j < base; j++) {
				if (matrizBinaria[i][j]==1) 
					aux.add(elemtMochila[j]);
			}
			for (int n = 0; n < aux.size(); n++)
				peso= peso+aux.get(n);
			if (peso==pesoMochila)
				System.out.println(aux.toString());
		}
	}
	
	public static  ArrayList<ArrayList<Integer>> llenarMochila(
						int[] elemtMochila, int pesoMochila) {
		int[][] matrizBinaria;
		int element= elemtMochila.length;
		Mochila1a mochila= new Mochila1a(element);
		matrizBinaria= mochila.matrixBinario();
		mochila.solucionesFuerzaBruta (matrizBinaria, elemtMochila, pesoMochila);		
		return null;
	}	

	@Override
	public String toString(){
			String ret = "";
			int nn = potenciaRec(n);
			for (int j=0;j<nn;j++){
				for (int i=0;i<n;i++){
					ret = ret + soluciones[j][i] ;
				}ret = ret + "\n";				
			}			
			return ret;
	}

	private int potenciaRec(int x){
		if(x==0)
			return 1;
		return (BASE_n*potenciaRec(x-1));
	}
}