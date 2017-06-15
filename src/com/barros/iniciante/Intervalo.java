package com.barros.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		
		Float entrada = cam.nextFloat();
		
		if(entrada < 0 || entrada > 100){			
			System.out.println("Fora de intervalo");
		}else if(entrada > 50 && entrada <= 75){
			System.out.println("Intervalo (50,75]");
		}else if(entrada > 75){
			System.out.println("Intervalo (75,100]");
		}else if(entrada > 25 && entrada <= 50){
			System.out.println("Intervalo (25,50]");
		}else if(entrada <= 25){
			System.out.println("Intervalo [0,25]");
		}
		
		cam.close();
	}
}
