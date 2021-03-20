package com.datos;

import java.util.Scanner;

public class Caso_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese núnero: ");
		int num = sc.nextInt();
		
		System.out.println("\nTabla del " + num);
		System.out.println("===========");
		
		for (int i = 1; i <= 15; i++)
			System.out.println(num + " X " + i + " = " + (num * i));
	}
}