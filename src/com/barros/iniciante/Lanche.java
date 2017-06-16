package com.barros.iniciante;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		
		Integer codigo = cam.nextInt(), quantidade = cam.nextInt();
		totalAPagar(codigo, quantidade);
		
		cam.close();
	}
	
	static void totalAPagar(Integer codigo, Integer quantidade) throws UnsupportedEncodingException{
		DecimalFormatSymbols dft = new DecimalFormatSymbols(Locale.US);
		dft.setDecimalSeparator('.');
		dft.setGroupingSeparator(',');
		
		DecimalFormat format = new DecimalFormat("#0.00",dft);
		
		if(codigo == 1)
			System.out.println("Total: R$ " + format.format(4.00 * quantidade));
		if(codigo == 2)
			System.out.println("Total: R$ " + format.format(4.50 * quantidade));
		if(codigo == 3)
			System.out.println("Total: R$ " + format.format(5.00 * quantidade));
		if(codigo == 4)
			System.out.println("Total: R$ " + format.format(2.00 * quantidade));
		if(codigo == 5)
			System.out.println("Total: R$ " + format.format(1.50 * quantidade));
	}
}
