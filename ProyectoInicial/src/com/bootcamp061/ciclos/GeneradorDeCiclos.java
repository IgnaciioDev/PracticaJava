package com.bootcamp061.ciclos;

import java.util.Scanner;

public class GeneradorDeCiclos {
	
	Scanner scanner = new Scanner(System.in);
	
	public void tablaMultiplicar() {
		System.out.println("Ingresa un un numero y te muestro tu tabla de tu multiplicar");
		int numero = scanner.nextInt();
		System.out.println("*** Tabla de multiplicar del " + numero + " ***");
		
		for(int i = 0; i <= 10; i++) {
			int resultado = numero * i;
			
			System.out.println(numero + " X " + i + " = " + resultado);
		}
		scanner.close();
	}
}
