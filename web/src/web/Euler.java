/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.Scanner;

/**
 *
 *
 */
public class Euler {
    
public static void main (String[] agrs){
		
		int numero = 0;
		double base = 0;
		int exponente = 0;
		int terminos = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		numero = sc.nextInt();
		System.out.println("El factorial de " + numero + ": " + factorial(numero));
		
		System.out.println("Digite la base y el exponente: ");
		base = sc.nextDouble();
		exponente = sc.nextInt();
		System.out.println("Potencia de base = " + base + ": " + "exponente " + exponente + " = " + potencia(base, exponente));
	
		System.out.println("Digite el exponente y los terminos para hallar euler: ");
		exponente = sc.nextInt();
		terminos = sc.nextInt();
		System.out.println("Euler a = " + exponente + "con terminos " + terminos + " = " + euler(exponente, terminos));	
	
	}
	
	public static double factorial(int numero){
		double respuesta = 1;
	
		if (numero == 0 || numero == 1){
			return 1;
		}else{
				for (int i=2; i<=numero; i++){
					respuesta = respuesta * i;
				}
			}
		return respuesta;
	}
	
	public static double potencia(double base, double exponente){
		double resultado = 1;
		
		if (base == 0){
			return 0;
		}else{
			if (exponente == 0){
				return 1;
			}else{
				for (int i=0; i<exponente; i++){
					resultado = resultado * base;
				}
	     		return resultado;
			}
		}
	}
	public static double euler (int numero, int terminos){
		double sumatoria = 0;
		double termino = 0;
		
		for(int i=0; i<terminos; i++){
			termino = potencia(numero,i)/factorial(i);
			sumatoria = sumatoria + termino;
		}
		return sumatoria;
	}
}
