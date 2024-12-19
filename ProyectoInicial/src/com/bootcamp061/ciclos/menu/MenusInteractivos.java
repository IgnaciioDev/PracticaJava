package com.bootcamp061.ciclos.menu;

import java.util.Scanner;

import com.bootcamp061.condicionales.Comparador;

public class MenusInteractivos {
	Scanner scanner = new Scanner(System.in);
	Comparador comparador = new Comparador();
	/**
	 * Menu generado utilizando un while
	 * */
	
	public void menuV1() {
		int opcion = 0;
		
		while(opcion != 4) {
			
			formatoMenu();
			
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Eligio la opcion 1 - Ejecutanto comparacion numeros");
					comparador.comparaNumero();
					break;
				case 2:
					System.out.println("Eligio la opcion 2");
					break;
				case 3:
					System.out.println("Eligio la opcion 3");
					break;
				case 4:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Ingrese una opcio valida, intentalo de nuevo.");
					
			}
			
			System.out.println();
		}
		scanner.close();
	}
	
	/**
	 * Menu generado utilizando un do-while
	 * do = de hacer
	 * */
	public void menuV2() {
		int opcion;
		
		do {
			//logica
			formatoMenu();
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Eligio la opcion 1");
					break;
				case 2:
					System.out.println("Eligio la opcion 2");
					break;
				case 3:
					System.out.println("Eligio la opcion 3");
					break;
				case 4:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Ingrese una opcio valida, intentalo de nuevo.");
					
			}
					System.out.println();
		}while(opcion != 4);
	}
	
	
	/**
	 * Menu gerenado utilizando FOR (no recomendable, mejor usar while o do-while)
	 * */
	
	public void menuV3() {
		int opcion = 0;
		for(;opcion != 4; ) {
			formatoMenu();
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Eligio la opcion 1");
					break;
				case 2:
					System.out.println("Eligio la opcion 2");
					break;
				case 3:
					System.out.println("Eligio la opcion 3");
					break;
				case 4:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Ingrese una opcio valida, intentalo de nuevo.");
				
			}
					System.out.println();
		}
	}
	
	
	public void formatoMenu() {
		System.out.println("*************************");
		System.out.println("*          MENU         *");
		System.out.println("*************************");
		System.out.println("*** 1- Primera opcion ***");
		System.out.println("*** 2- Segunda opcion ***");
		System.out.println("*** 3- Tercera opcion ***");
		System.out.println("*** 4- Salir del menu ***");
		System.out.println("*************************");
		System.out.println("Elige una opcion: ");
	}
}
