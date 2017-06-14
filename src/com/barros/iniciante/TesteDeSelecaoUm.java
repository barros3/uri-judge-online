package com.barros.iniciante;

import java.util.Scanner;

public class TesteDeSelecaoUm {

	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		
		Integer a = cam.nextInt(), b = cam.nextInt(), c = cam.nextInt(), d = cam.nextInt();
		
		if((b > c) && 
				(d > a) && 
			((c + d) > (a +b)) &&
						(c > 0) &&
							(d > 0) &&
							(a % 2 == 0)){			
			System.out.println("Valores aceitos");
		}else	System.out.println("Valores nao aceitos");
		
		cam.close();
	}
	
}
