package com.barros.iniciante;

import java.util.Scanner;

public class ConversaoTempo {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		
		int segundo = 0, minutoResto = 0, minuto = 0, hora = 0, horaResto = 0, entrada = cam.nextInt(); // entrada em segundos
	
		if(entrada > 3599){
			hora = entrada / 3600;
			horaResto = entrada % 3600;
			if(horaResto > 59){
				minuto = horaResto / 60;
				minutoResto = horaResto % 60;
				if(minutoResto != 0)
					segundo = segundo + minutoResto; 
			}else{
				segundo += horaResto;
			}
		}else{
			minuto = entrada / 60;
			minutoResto = entrada % 60;
			segundo = segundo + minutoResto;
		}
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		cam.close(); 
	}

}
