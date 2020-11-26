package com.example.jegm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jegm.problemasCEROaCUATRO.Problema3;
import com.example.jegm.problemasCEROaCUATRO.Problema4;
import com.example.jegm.problemasCEROaCUATRO.ProblemaCERO;
import com.example.jegm.problemasCEROaCUATRO.ProblemaDOS;
import com.example.jegm.problemasCEROaCUATRO.ProblemaUno;

@SpringBootApplication
public class JegmApplication {

	public static void main(String[] args) {
		
		//CLASS
    	ProblemaCERO p0 = new ProblemaCERO();
    	ProblemaUno p1 = new ProblemaUno();
    	ProblemaDOS p2 = new ProblemaDOS();
    	Problema3 p3 = new Problema3();
    	Problema4 p4 = new Problema4();
    	//CLASS
    	
    	//PROBLEMA 1
        System.out.println( "0.- Problema 1 Escribir tu nombre en una constante de cadena, imprimirlo 10 000 veces SIN usar ningún tipo de ciclo" );
        System.out.println(p0.miNombre());
    	//PROBLEMA 2
        System.out.println("1.-  un ciclo que imprima los números del 0 al 1000 salteados de 5 en 5");
        p1.problema1Funcion();
        System.out.println("2.-  un ciclo que imprima los numeros del 1000 al 0 salteados de 10 en 10.");
        p2.problema2Funcion();
        //PROBLEMA 
        System.out.println("3.-  pedir el nombre del usuario e imprimir en consola solo las vocales.");
        p3.problema3Funcion();
        //PROBLEMA 
        System.out.println("4.- Realizar un programa que imprima los primeros 50 dígitos de la serie de Fibonacci");
        p4.inicio();
		
		
		SpringApplication.run(JegmApplication.class, args);
	}

}
