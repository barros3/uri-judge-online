package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static Double calculaSalario(int horasTrabalhadas, double valorPorHora){
		return horasTrabalhadas * valorPorHora;
	}
	
	public static String entrada(Double entrada){
		DecimalFormatSymbols simboloDecimal = new DecimalFormatSymbols(Locale.ROOT);
		simboloDecimal.setDecimalSeparator('.');
		simboloDecimal.setGroupingSeparator(',');
		DecimalFormat decimalFormat = new DecimalFormat("#0.00", simboloDecimal);
		return decimalFormat.format(entrada);
	}
	
	public static void main(String[] args) {
		Scanner cam = new Scanner (System.in);
		cam.useLocale(Locale.US);
		
		int numFuncionario, horasTrabalhadas;
		double valorPorHora;
		
		numFuncionario = cam.nextInt();
		horasTrabalhadas = cam.nextInt();
		valorPorHora = cam.nextDouble();
		
		System.out.println("NUMBER = " + numFuncionario + 
							"\nSALARY = U$ " + entrada(calculaSalario(horasTrabalhadas, valorPorHora)));		
		cam.close();
	}
	
}
