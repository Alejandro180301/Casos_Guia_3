package com.datos;

import java.util.Scanner;

public class Caso_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		// For ascendente de 1 en 1
		for (int x = 1; x <= 10; x++)
			System.out.println(x + ". Bienvenido(a) " + nombre + " al curso");
		
		System.out.println("\n");
		
		// For descendente de 2 en 2
		for (int j = 10; j >= 1; j -= 2)
			System.out.println("Valor " + j);
	}
}