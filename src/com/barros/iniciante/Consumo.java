package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Consumo {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		
		int km;
		float l;
		
		km = cam.nextInt();
		l = cam.nextFloat();
		
		calculaConsumo(km, l);
		
		System.out.println(entrada(calculaConsumo(km, l)) + " km/l");
		
		cam.close();
	}
	
	static Float calculaConsumo(int km, float l){
		return km / l;
	}

	static String entrada(Float entrada){
		DecimalFormatSymbols simbols =  new DecimalFormatSymbols(Locale.US);
		simbols.setDecimalSeparator('.');
		simbols.setGroupingSeparator(',');
		DecimalFormat format =  new DecimalFormat("#0.000", simbols);
		return format.format(entrada);
	}
}
