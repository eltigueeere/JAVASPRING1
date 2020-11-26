package com.example.jegm.problemasCEROaCUATRO;

public class Problema4 {

	public void inicio() {
		  int serie = 50;
		  
	      for (int i = 0; i < serie; i++) {

	          System.out.println(fiboR(i));
	      }
	}
      
      public static int fiboR(int n) {
    	  
          if (n == 0) {
              return 0;   
          } else if (n == 1) {
              return 1;
          } else {
              return fiboR(n - 1) + fiboR(n - 2);
          }
   
      }

}
