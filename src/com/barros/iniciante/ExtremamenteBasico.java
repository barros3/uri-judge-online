package com.barros.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico {

	  public static void main(String[] args) throws IOException {
		  
	        Scanner cam = new Scanner(System.in);
			
	        int num1 = cam.nextInt(), num2 = cam.nextInt();
			System.out.println("X = " + Math.addExact(num1, num2));
			
			cam.close();
	 
	    }
	    
}