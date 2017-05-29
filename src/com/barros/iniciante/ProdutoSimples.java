package com.barros.iniciante;

import java.util.Scanner;

public class ProdutoSimples {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		
		int a, b;
		
		a = cam.nextInt();
		b = cam.nextInt();
		
		System.out.println("PROD = " + Math.multiplyExact(a, b));
		
		cam.close();
	}

}
