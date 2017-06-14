package com.barros.iniciante;

import java.util.Scanner;

public class IdadeEmDias {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		Integer ano = 0, anoResto = 0, mes = 0, mesResto = 0, dias = 0, entrada = cam.nextInt();
		
		if(entrada > 364){
			ano = entrada / 365;
			anoResto = entrada % 365;
			if(anoResto > 29){
				mes = anoResto / 30;
				mesResto = anoResto % 30;
				if(mesResto !=0)
					dias += mesResto;
			}else{
				dias += anoResto;
			}
		}else{
			mes = entrada / 30;
			dias = entrada % 30;
		}
		
		System.out.println(ano + " ano(s)\n" + mes + " mes(es)\n" + dias + " dia(s)");
		cam.close();
	}
}
