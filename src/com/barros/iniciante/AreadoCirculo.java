package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class AreadoCirculo {
	
	public static String entrada(Double entrada){
		DecimalFormatSymbols simboloDecimal = new DecimalFormatSymbols(Locale.ROOT);
		simboloDecimal.setDecimalSeparator('.');
		simboloDecimal.setGroupingSeparator(',');
		DecimalFormat decimalFormat = new DecimalFormat("#0.0000", simboloDecimal);
		return decimalFormat.format(entrada);
	}
	
	public static Double calculaAreaCicurlo(double area, double raio){
		final double n = 3.14159;
		return area =  (n * (Math.pow(raio,2)));
	}
	
	public static void main(String[] args) {
		
		Scanner cam = new Scanner (System.in);
		cam.useLocale(Locale.ROOT);
		
		double area = 0, raio;
		
		raio = cam.nextDouble();
		
		System.out.println("A="+ entrada(calculaAreaCicurlo(area, raio)));
		
		cam.close();
	}

}
