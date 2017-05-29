package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		
		float x1, x2, y1, y2;
		
		x1 = cam.nextFloat();
		y1 = cam.nextFloat();

		x2 = cam.nextFloat();
		y2 = cam.nextFloat();		
		
		System.out.println(entrada(calculaDistanciaDoisPontos(x1, y1, x2, y2)));
		
		cam.close();
	}
	
	static Float calculaDistanciaDoisPontos(float x1, float y1, float x2, float y2){
		return (float) Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1), 2));
	}
	
	static String entrada(Float entrada){
		DecimalFormatSymbols simbols = new DecimalFormatSymbols(Locale.US);
		simbols.setDecimalSeparator('.');
		simbols.setGroupingSeparator('.');
		return new DecimalFormat("#0.0000", simbols).format(entrada); 
	}
	
}
