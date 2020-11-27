package com.example.jegm.problemasCEROaCUATRO;

public class ProblemaCERO {

	static final String nombreConstante = "Eduardo Guerrero";
	int n = 0;
	
	public String miNombre(){
	    if (n==10) {
		    System.out.println("En lugar de ciclos use recurcividad:");
	    	return null;
	    }
	    n++;
	    System.out.println(nombreConstante);
	    return miNombre();
	}
	
}
