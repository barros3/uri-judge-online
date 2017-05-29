package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class MediaUm {

	public static Float mediaPonderada(float a, float b){
		return (((a * 3.5f) + (b * 7.5f)) / 11);
	}
	
	public static String entrada(Float entrada){
		DecimalFormatSymbols simboloDecimal = new DecimalFormatSymbols(Locale.ROOT);
		simboloDecimal.setDecimalSeparator('.');
		simboloDecimal.setGroupingSeparator(',');
		DecimalFormat decimalFormat = new DecimalFormat("#0.00000", simboloDecimal);
		return decimalFormat.format(entrada);
	}
	
	public static void main(String[] args) {
		Scanner cam = new Scanner (System.in);
		cam.useLocale(Locale.US);
		
		float a, b;
		
		a = cam.nextFloat();
		b = cam.nextFloat();
		
		System.out.println("MEDIA = " + entrada(mediaPonderada(a, b)) );
		
		cam.close();
	}
	
}
