package com.datos;

import java.util.Scanner;

public class Caso_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		int factorial = 1, i = 1;
		
		if (n <= 7) {
			while (i <= n) {
				factorial *= i;
				
				if (i < n)
					System.out.print(i + " x ");
				else
					System.out.print(i + " = " + factorial);
				
				i++;
			}
		}
		else
			System.out.println("El número es superior a 7");
	}
}