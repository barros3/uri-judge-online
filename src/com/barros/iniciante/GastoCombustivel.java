package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class GastoCombustivel {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner (System.in);
		
		final double consumo = 12;
		double distancia, velocidade, litros, tempo;
		
		tempo = cam.nextDouble();
		velocidade = cam.nextDouble();
		
		distancia = tempo * velocidade;
		
		litros = distancia/consumo;
		
		System.out.println(entrada(litros));
		
		cam.close();
	}
	
	static String entrada(Double entrada){
		DecimalFormatSymbols simbols = new DecimalFormatSymbols(Locale.US);
		simbols.setDecimalSeparator('.');
		simbols.setGroupingSeparator('.');
		return new DecimalFormat("#0.000", simbols).format(entrada); 
	}

}
