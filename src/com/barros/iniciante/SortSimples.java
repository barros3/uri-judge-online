package com.barros.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
	
	public static void main(String[] args) {
		Scanner cam = new Scanner(System.in);
		
		Integer[] sort = new Integer[3];
		
		for (int i = 0; i < sort.length; i++) {
			sort[i] = cam.nextInt();
		}
		
		Integer[] original = sort.clone();
		
		Arrays.sort(sort);	
		
		for(Integer l: sort){
			System.out.println(l.intValue());
		}
		System.out.println("");

		for(Integer l: original){
			System.out.println(l.intValue());
		}
		
		cam.close();
	}
}
