package com.datos;

import java.util.Scanner;

public class Caso_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1, num_mayor = 0, n = 0;
		
		while (i <= 4) {
			System.out.print("Ingrese número " + i + " : ");
			n = sc.nextInt();
			
			if (n > num_mayor)
				num_mayor = n;
			
			i++;
		}
		
		System.out.println("\nEl número " + num_mayor + " es el mayor");
	}
}