package com.datos;

import java.util.Scanner;

public class Caso_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nr =0, edad = 0, num_aptos = 0;
		String nombre = "", estado = "", rpta = "S";
		
		// ALT + 124 = |
		while (rpta.equals("S") || rpta.equals("s")) {
			nr++;
			System.out.println("\n--- R E G I S T R O [" + nr + "] ---");
			
			System.out.print("Nombre del participante: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad del participante: ");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				num_aptos ++;
			}
			else
				estado = "No apto para votar";
			
			System.out.println("Estado :" + estado);
			
			sc.nextLine();
			
			System.out.print("\n¿Desea registrar otro participante <S/N>: ");
			rpta = sc.nextLine();
		}
		
		System.out.println("\n--- R E S U M E N ---");
		System.out.println("Paticipante registrados: " + nr);
		System.out.println("Cantidad de participantes aptos para votar: " + num_aptos);
	}
}