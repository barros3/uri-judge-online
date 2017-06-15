package com.barros.iniciante;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class FormulaBhaskara {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		
		PrintStream out = new PrintStream(System.out, true, "UTF-8");

		double a = cam.nextFloat(), b = cam.nextFloat(), c = cam.nextFloat();
		
		float delta = (float) (Math.pow(b, 2) - ((4 * a) * c));
		Float raizDelta = (float) Math.sqrt(delta);
		
		Float R1 = (float) (((-b / (2 * a)) + (raizDelta / (2 * a))));
		Float R2 = (float) (((-b / (2 * a)) - (raizDelta / (2 * a))));
		
		if(R1.isNaN() || R1.isInfinite() || R2.isNaN() || R2.isInfinite())
			out.println("Impossivel calcular");
		else
			out.println("R1 = " + entrada(R1) + "\nR2 = " + entrada(R2));
		
		cam.close();
	}
	public static String entrada(Float entrada){
		DecimalFormatSymbols simboloDecimal = new DecimalFormatSymbols(Locale.US);
		simboloDecimal.setDecimalSeparator('.');
		simboloDecimal.setGroupingSeparator(',');
		DecimalFormat decimalFormat = new DecimalFormat("#0.00000", simboloDecimal);
		return decimalFormat.format(entrada);
	}
}
