package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class MediaDois {

	public static Float mediaPonderada(float a, float b, float c){
		return (((a * 2f) + (b * 3f) + (c * 5f)) / 10);
	}
	
	public static String entrada(Float entrada){
		DecimalFormatSymbols simboloDecimal = new DecimalFormatSymbols(Locale.ROOT);
		simboloDecimal.setDecimalSeparator('.');
		simboloDecimal.setGroupingSeparator(',');
		DecimalFormat decimalFormat = new DecimalFormat("#0.0", simboloDecimal);
		return decimalFormat.format(entrada);
	}
	
	public static void main(String[] args) {
		Scanner cam = new Scanner (System.in);
		cam.useLocale(Locale.US);
		
		float a, b, c;
		
		a = cam.nextFloat();
		b = cam.nextFloat();
		c = cam.nextFloat();
		
		System.out.println("MEDIA = " + entrada(mediaPonderada(a, b, c)) );
		
		cam.close();
	}
	
}
