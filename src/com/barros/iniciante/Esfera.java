package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Esfera {

	final static double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		
		double raio = cam.nextDouble();
		
		System.out.println("VOLUME = " + entrada(calculaAreaEsfera(raio)));
		
		cam.close();
	}

	static double calculaAreaEsfera(double raio){
		return (4*PI*(Math.pow(raio, 3))) / 3;
	}
	
	static String entrada(double entrada){
		DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.US);
		format.setDecimalSeparator('.');
		format.setGroupingSeparator(',');
		DecimalFormat decimal = new DecimalFormat("#0.000", format);
		return decimal.format(entrada);
	}
	
}
