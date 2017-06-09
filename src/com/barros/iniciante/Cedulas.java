package com.barros.iniciante;

import java.util.Scanner;

public class Cedulas {
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		Integer restoInt = 0, valor = cam.nextInt();
		
		System.out.println(valor);
		
		int resto100 = valor % 100; // 76
		restoInt = valor / 100;	// 576/100 = 5 
		
		System.out.println(restoInt + " nota(s) de R$ 100,00");
		
		int resto50 = resto100 % 50; // 26 
		restoInt = resto100 / 50;
		System.out.println(restoInt + " nota(s) de R$ 50,00");

		int resto20 = resto50 % 20;
		restoInt = resto50 / 20;
		System.out.println(restoInt + " nota(s) de R$ 20,00");

		int resto10 = resto20 % 10;
		restoInt = resto20 / 10;
		System.out.println(restoInt + " nota(s) de R$ 10,00");

		int resto5 = resto10 % 5;
		restoInt = resto10 / 5;
		System.out.println(restoInt + " nota(s) de R$ 5,00");

		int resto2 = resto5 % 2;
		restoInt = resto5 / 2;
		System.out.println(restoInt + " nota(s) de R$ 2,00");

		restoInt = resto2 / 1;
		System.out.println(restoInt + " nota(s) de R$ 1,00");
		
		cam.close();
	}
}
