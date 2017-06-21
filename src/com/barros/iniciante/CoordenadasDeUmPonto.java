package com.barros.iniciante;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Scanner;

public class CoordenadasDeUmPonto {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		cam.useLocale(Locale.US);
		try {
			Float x = cam.nextFloat(), y = cam.nextFloat();
			checkPontoFlutuante(x, y);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		cam.close();
	}
	
	static void checkPontoFlutuante(Float x, Float y) throws UnsupportedEncodingException{

		if(x == 0.0 && y == 0.0)
			System.out.println("Origem");
		else if(x > 0.0 && y > 0.0)
			System.out.println("Q1");
		else if(x < 0.0 && y > 0.0)
			System.out.println("Q2");
		else if(x < 0.0 && y < 0.0)
			System.out.println("Q3");
		else if(x > 0.0 && y < 0.0)
			System.out.println("Q4");
		else if(x == 0.0 && y != 0.0)
			System.out.println("Eixo Y");
		else if(y == 0.0 && x != 0.0)
			System.out.println("Eixo X");
		
	}

}
