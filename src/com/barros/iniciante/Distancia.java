package com.barros.iniciante;

import java.util.Scanner;

public class Distancia {
	
	public static void main(String[] args) {
		
		Scanner cam = new Scanner(System.in);
		
		int km = cam.nextInt();
		
		int minutosy = km * 2;
				
		System.out.println(minutosy + " minutos");
		
		cam.close();
		
	}
}
