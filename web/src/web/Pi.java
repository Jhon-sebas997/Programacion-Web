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
public class Pi {
    
static Scanner entrada = new Scanner (System.in);
        // TODO code application logic here
public static void main (String[] agrs){
    
    float s =0;
    
    System.out.println("Cantidad de terminos a generar:");
    int cantidadTerminos = entrada.nextInt();
    
    for(int i = 1; i <= cantidadTerminos; i++){
        if(i % 2 ==0)
            s = s - (4/((i*2)-1));
        else
            s = s + (4/((i*2)-1));
    }
    System.out.println("Pi:"+s);
	}
}