package com.barros.iniciante;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class MediaTres {

	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		try {
			Float n1 = cam.nextFloat(), n2 = cam.nextFloat(), n3 = cam.nextFloat(), n4 = cam.nextFloat();
			formatSaida(calculaMediaPonderada(n1, n2, n3, n4), cam);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		cam.close();
	}
	
	static Float calculaMediaPonderada(Float n1, Float n2, Float n3, Float n4){
		return ((n1 *2) + (n2 *3) + (n3 *4) + (n4 *1))/ 10;
	}
	
	static void formatSaida(Float entrada, Scanner cam) throws UnsupportedEncodingException{
		DecimalFormatSymbols dft = new DecimalFormatSymbols(Locale.US);
		dft.setDecimalSeparator('.');
		dft.setGroupingSeparator(',');
		
		DecimalFormat format = new DecimalFormat("#0.0",dft);
		
		if(entrada >= 7)
			System.out.println("Media: " + format.format(entrada) +"\nAluno aprovado.");
		if(entrada < 5)
			System.out.println("Media: " + format.format(entrada) + "\nAluno reprovado.");
		if(entrada >= 5 && entrada < 7){			
			
			Float nF =  cam.nextFloat();
			
			System.out.println("Media: " + format.format(entrada) + "\nAluno em exame.");			
			System.out.println("Nota do exame: " + format.format(nF));
			
			Float mediaFinal = (entrada + nF)/2;
			if(mediaFinal >= 5)
				System.out.println("Aluno aprovado.\nMedia final: " + format.format(mediaFinal));
			else
				System.out.println("Aluno reprovado.");
		}

	}
}
