package com.barros.iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
	
	public static Double totalDaConta = 0.0;
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.ROOT);
		
		int codigoPeca, quantidadeDePecas;
		double precoDaPeca;
		
		codigoPeca = cam.nextInt();
		quantidadeDePecas = cam.nextInt();
		precoDaPeca = cam.nextDouble();
		
		calculaPrecoDePecas(precoDaPeca, quantidadeDePecas);
		
		codigoPeca = cam.nextInt();
		quantidadeDePecas = cam.nextInt();
		precoDaPeca = cam.nextDouble();
		
		System.out.println("VALOR A PAGAR: R$ " + entrada(calculaPrecoDePecas(precoDaPeca, quantidadeDePecas)));
		
		cam.close();
	}
	
	public static Double calculaPrecoDePecas(double precoDaPeca, int quantidadeDePecas){
		return totalDaConta += (precoDaPeca * quantidadeDePecas);
	}
	
	public static String entrada(Double entrada){
		DecimalFormatSymbols simbolo = new DecimalFormatSymbols(Locale.ROOT);
		simbolo.setDecimalSeparator('.');
		simbolo.setGroupingSeparator(',');
		DecimalFormat format = new DecimalFormat("#0.00", simbolo);
		return format.format(entrada); 
	}
	
}	
