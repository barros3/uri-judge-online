package com.barros.iniciante;

import java.util.Scanner;

public class Diferenca {

	public static int diferencaProduto(int a, int b, int c, int d){
		return ((a * b) - (c * d));
	}

	public static void main(String[] args) {
		Scanner cam = new Scanner (System.in);
		
		int a, b, c, d;
		
		a = cam.nextInt();
		b = cam.nextInt();
		c = cam.nextInt();
		d = cam.nextInt();
		
		System.out.println("DIFERENCA = " + diferencaProduto(a, b, c, d));
		
		cam.close();
	}
	
}
