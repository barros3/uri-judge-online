package com.barros.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class SomaSimples {
	
	public static void main(String[] args){
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.ROOT);
		
		int a, b;
		
		a = cam.nextInt();
		b = cam.nextInt();
		
		System.out.println("SOMA = " + Math.addExact(a, b));
		
		cam.close();
	}
	
}