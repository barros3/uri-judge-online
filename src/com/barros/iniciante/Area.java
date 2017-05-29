package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Area {
	
	static final Double PI = 3.14159;

	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		
		float a, b, c;
		
		a = cam.nextFloat();
		b = cam.nextFloat();
		c = cam.nextFloat();
		
		System.out.
           println("TRIANGULO: " + entrada(areaTrianguloRetangulo(a, c))
				 + "\nCIRCULO: " + entrada(areaCirculo(c))
				 + "\nTRAPEZIO: " + entrada(areaTrapezio(a, b, c))
				 + "\nQUADRADO: " + entrada(areaQuadrado(b))
				 + "\nRETANGULO: " + entrada(areaRetangulo(a, b))
				 );
		cam.close();
	}
	
	static Double areaTrianguloRetangulo(float a, float c){
		return (double)(a * c ) / 2;
	}

	static Double areaCirculo(float raioC){
		return (double) PI*Math.pow(raioC, 2); 
	}
	
	static Double areaTrapezio(float baseA, float baseB, float alturaC){
		return (double) ((baseA + baseB) * alturaC) / 2;
	}
	
	static Double areaQuadrado(float ladoB){
		return Math.pow(ladoB, 2);
	}
	
	static Double areaRetangulo(float ladoA, float ladoB){
		return (double) ladoA * ladoB;
	}
	
	static String entrada(Double entrada){
		
		DecimalFormatSymbols symbol = new DecimalFormatSymbols(Locale.US);
		symbol.setDecimalSeparator('.');
		symbol.setGroupingSeparator(',');
		DecimalFormat format = new DecimalFormat("#0.000", symbol);
		return format.format(entrada);
		
	}
	
}
