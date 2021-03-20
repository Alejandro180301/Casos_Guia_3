package com.datos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String nombre = "", rpta = "S", nom_mayor = "", nom_menor = "", nom_min = "";
		int nr = 0, meta = 0;
		float horas_trabajadas = 0, tarifa = 0, minutos = 0, sueldo_bruto = 0, bonificacion = 0, dscto = 0, sueldo_neto = 0, pa = 0,
				sueldo_mayor = 0, sueldo_menor = 0, min_mayor = 0;
		
		while (rpta.equals("S") || rpta.equals("s")) {
			nr ++;
			System.out.println("--- Registro de empelados [" + nr + "] ---");
			
			System.out.print("Empleado : ");
			nombre = sc.nextLine();
			
			System.out.print("Horas trabajadas: ");
			horas_trabajadas = sc.nextFloat();
			
			System.out.print("Tarifa por hora: ");
			tarifa = sc.nextFloat();
			
			System.out.print("Minutos de tardanza: ");
			minutos = sc.nextFloat();
			
			sueldo_bruto = horas_trabajadas * tarifa;
			pa = horas_trabajadas / 80 * 100;
			
			if (horas_trabajadas <= 50) bonificacion = 0;
			else if (horas_trabajadas > 50 && horas_trabajadas <= 60) bonificacion = sueldo_bruto * 0.02f;
			else if (horas_trabajadas > 60 && horas_trabajadas <= 70) bonificacion = sueldo_bruto * 0.08f;
			else if (horas_trabajadas > 70 && horas_trabajadas <= 80) bonificacion = sueldo_bruto * 0.13f;
			else if (horas_trabajadas > 80) bonificacion = sueldo_bruto * 0.15f;
			
			if (minutos <= 15) dscto = 0;
			else if (minutos > 15 && minutos <= 30) dscto = ((sueldo_bruto * minutos) * 0.3f) / 100;
			else if (minutos > 30) dscto = ((sueldo_bruto * minutos) * 0.5f) / 100;
			
			sueldo_neto = (sueldo_bruto + bonificacion) - dscto;
			
			if (nr == 1) {
				sueldo_mayor = sueldo_neto;
				sueldo_menor = sueldo_neto;
				min_mayor = minutos;
				nom_mayor = nombre;
				nom_menor = nombre;
				nom_min = nombre;
			}
			
			if (sueldo_neto > sueldo_mayor) {
				sueldo_mayor = sueldo_neto;
				nom_mayor = nombre;
			}
			
			if (sueldo_neto < sueldo_menor) {
				sueldo_menor = sueldo_neto;
				nom_menor = nombre;
			}
			
			if (minutos > min_mayor) {
				min_mayor = minutos;
				nom_min = nombre;
			}
			
			if (pa > 90) meta ++;
			
			System.out.println("\n--- R E S U L T A D O S ---");
			System.out.println("Sueldo Bruto: " + df.format(sueldo_bruto));
			System.out.println("Bonificación: " + bonificacion);
			System.out.println("Descuento: " + dscto);
			System.out.println("Sueldo neto: " + df.format(sueldo_neto));
			System.out.println("% Alcanzado: " + df.format(pa) + "%");
			
			sc.nextLine();
			System.out.print("\n¿Desea ingresar otro empleado? [S/N]: ");
			rpta = sc.nextLine();
			
			System.out.println("");
		}
		
		System.out.println("--- R E S U M E N ---");
		System.out.println("Sueldo neto mayor: " + sueldo_mayor + " pertenece a: " + nom_mayor.toUpperCase());
		System.out.println("Sueldo neto menor: " + sueldo_menor + " pertenece a: " + nom_menor.toUpperCase());
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + nom_min.toUpperCase() + " (" + min_mayor + " min)");	
		System.out.println("Cantidad de empleados con mas del 90% de la meta: " + meta);
	}
}