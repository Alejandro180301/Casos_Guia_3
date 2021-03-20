package com.datos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float nota1 = 0, nota2 = 0, nota3 = 0, asistencia = 0, promedio = 0, pa = 0, pro_mayor = 0, pro_menor = 0;
		int nr = 0, certi = 0, no_certi = 0;
		String nombre = "", estado = "Sin certificado", rpta = "S", nom_mayor = "", nom_menor = "";
		
		while (rpta.equals("S") || rpta.equals("s")) {
			nr++;
			System.out.println("--- R E G I S T R O [" + nr + "] ---");
			
			System.out.print("Ingrese el nombre del alumno: ");
			nombre = sc.nextLine();
			
			System.out.print("Ingrese nota 1: ");
			nota1 = sc.nextFloat();
			
			System.out.print("Ingrese nota 2: ");
			nota2 = sc.nextFloat();
			
			System.out.print("Ingrese nota 3: ");
			nota3 = sc.nextFloat();
			
			System.out.print("Ingrese número de asistencias [1-12]: ");
			asistencia = sc.nextFloat();
			
			promedio = (nota1 * 0.2f) + (nota2 * 0.3f) + (nota3 * 0.5f);
			pa = asistencia / 12 * 100;
			
			if (promedio >= 13 && pa >= 70) {
				estado = "Obtiene su certificado";
				certi += 1;
			}
			else
				no_certi += 1;
			
			if (nr == 1) {
				pro_mayor = promedio;
				nom_mayor = nombre;
				pro_menor = promedio;
				nom_menor = nombre;
			}
			
			if (promedio > pro_mayor) {
				pro_mayor = promedio;
				nom_mayor = nombre;
			}
			
			if (promedio < pro_menor) {
				pro_menor = promedio;
				nom_menor = nombre;
			}
			
			System.out.println("\n--- R E S U L T A D O ---");
			System.out.println("Alumno(a): " + nombre.toUpperCase());
			System.out.println("Promedio: " + df.format(promedio));
			System.out.println("Asistencias: " + df.format(pa) + "%");
			System.out.println("Estado: " + estado);
			
			sc.nextLine();
			System.out.print("\n¿Desea registrar otro? [S/N]: ");
			rpta = sc.nextLine();
			
			System.out.println("");
		}
		
		System.out.println("--- R E S U M E N ---");
		System.out.println("Número de alumnos registrados: " + nr);
		System.out.println("El mayor promedio es de " + pro_mayor + " que pertenece a " + nom_mayor);
		System.out.println("El menor promedio es de " + pro_menor + " que pertenece a " + nom_menor);
		System.out.println("Número de alumnos con certificado: " + certi);
		System.out.println("Número de alumnos sin certificado: " + no_certi);
	}
}