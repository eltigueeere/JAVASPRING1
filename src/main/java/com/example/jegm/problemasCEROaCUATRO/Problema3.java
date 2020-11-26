package com.example.jegm.problemasCEROaCUATRO;

import java.util.Scanner;

public class Problema3 {
	Scanner entradaTxt = new Scanner(System.in);
	String nombreProblema3 ="";
	public void problema3Funcion() {
        System.out.println("Ingresa tu nombre ");
        nombreProblema3 = entradaTxt.nextLine();
        System.out.println("LAS vocales son : ");
        for(int i=0; i<nombreProblema3.length(); i++) {
        	if( nombreProblema3.charAt(i) == 'A' || nombreProblema3.charAt(i) == 'E' || nombreProblema3.charAt(i) == 'I' || nombreProblema3.charAt(i) == 'O' || nombreProblema3.charAt(i) == 'U' ||
        			nombreProblema3.charAt(i) == 'a' || nombreProblema3.charAt(i) == 'e' || nombreProblema3.charAt(i) == 'i' || nombreProblema3.charAt(i) == 'o' || nombreProblema3.charAt(i) == 'u' ) {
        		System.out.print(nombreProblema3.charAt(i));
        	}
        }
	}
}
