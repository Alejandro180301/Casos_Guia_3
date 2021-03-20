package com.datos;

import java.util.Scanner;

public class Caso_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1, num_menor = 0, n = 0;
		
		while (i <= 5) {
			System.out.print("Ingrese número " + i + " : ");
			n = sc.nextInt();
			
			if (i == 1)
				num_menor = n;
			
			if (n < num_menor)
				num_menor = n;
			
			i++;
		}
		
		System.out.println("\nEl número " + num_menor + " es el menor");
	}
}