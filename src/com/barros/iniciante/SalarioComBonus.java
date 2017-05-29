package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {

	public static Double calculaSalarioComBonus(double salarioFixo, double totalDeVendasEmDinheiro){
		return (salarioFixo + (totalDeVendasEmDinheiro * 0.15));
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
		
		String nomeFuncionario;
		double salarioFixo, totalDeVendasEmDinheiro;
		
		nomeFuncionario = cam.nextLine();
		salarioFixo = cam.nextDouble();
		totalDeVendasEmDinheiro = cam.nextDouble();
		
		System.out.println("TOTAL = R$ " + entrada(calculaSalarioComBonus(salarioFixo, totalDeVendasEmDinheiro)));		
		cam.close();
		
	}
	
}
