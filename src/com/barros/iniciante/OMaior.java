package com.barros.iniciante;

import java.util.Scanner;

public class OMaior {

	public static void main(String[] args) {

		Scanner cam = new Scanner(System.in);
		
		int a, b, c;
		
		a = cam.nextInt();
		b = cam.nextInt();
		c = cam.nextInt();

		System.out.println(maiorAB(a, b, c) + " eh o maior");
		
		cam.close();
	}
	
	static Integer maiorAB(int a, int b, int c){
		int d = (a + b + Math.abs(a-b)) / 2;
		return (c + d + Math.abs(c-d)) / 2;
	}
	
}
