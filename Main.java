package Principal;

import java.util.Scanner;

// ejercicio de validacion de fecha.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese el dia: ");
		int dia = sc.nextInt();
		System.out.println("ingrese el mes: ");
		int mes = sc.nextInt();
		System.out.println("ingrese el año: ");
		int año = sc.nextInt();
		if (año >= 1900 && año <= 2099) { // rango de año solicitado
			if (mes >= 1 && mes <= 12) {
				if (mes == 2) {
					if ((dia >= 1 && dia <= 28)
							|| (dia == 29 && (año % 4 == 0) && (año % 100 != 0 || año % 400 == 0))) { // si es dia 29 y cumple con la condicion de año bisiesto
						System.out.println("año bisiesto, fecha valida");
					} else {
						System.out.println("año no bisiesto, fecha invalida");
					}
				} else {
					if (dia >= 1 && dia <= 30) {
						System.out.println("fecha correcta");
					} else {
						System.out.println("dia invalido");
					}
				}
			} else {
				System.out.println("el mes es incorrecto");
			}
		} else {
			System.out.println("el año es incorrecto");
		}
	}
}
