package com.bootcamp061.main;


import java.util.Scanner;

import com.bootcamp061.entidades.FichaMedica;
import com.bootcamp061.entidades.Persona;

public class Main {
	
	// Clases para usar sus constructores
	private static Persona persona;
	private static FichaMedica fichaMedica;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;
		do {
			System.out.println("*************************");
			System.out.println("*          MENU         *");
			System.out.println("*************************");
			
			System.out.println("*** 1- Crear Persona ***");
			System.out.println("*** 2- Crear ficha medica ***");
			System.out.println("*** 3- Mostrar Ficha Medica ***");
			System.out.println("*** 4- Salir ***");
			System.out.println("*************************");
			System.out.println("Elige una opcion: ");
			opcion = scanner.nextInt();
			scanner.nextLine(); // Limpia el buffer
			
			switch(opcion) {
				case 1:
					crearPersona();
					break;
				case 2:
					crearFichaMedica();
					break;
				case 3:
					mostrarFichaMedica();
					break;
				case 4:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Ingrese una opcio valida, intentalo de nuevo.");
			
			}
		}	while(opcion != 4);
	}
	
	private static void crearPersona() {
			System.out.println("Ingrese el nombre del paciente: ");
			String nombre = scanner.nextLine();
			
			System.out.println("Ingrese la edad: ");
			int edad = scanner.nextInt();
			
			System.out.println("Ingrese la direccion: ");
			String direccion = scanner.nextLine();
			
			persona = new Persona(nombre, edad, direccion );
			System.out.println("Paciente creado con exito...");
		
		}
	
	private static void crearFichaMedica() {
			if(persona == null) {
				System.out.println("Primero cree un paciente");
				return;
			}
			System.out.println("Ingrese el grupo sanguineo: ");
			String sanguinio = scanner.nextLine();
			
			System.out.println("Ingrese el peso ");
			double peso = scanner.nextDouble();
			
			System.out.println("Ingrese el altura:  ");
			double altura = scanner.nextDouble();
			
			fichaMedica = new FichaMedica(persona, sanguinio, peso, altura);
			
			System.out.println("Ficha creado exitosamente!!! ");
			
		}
	
	public static void mostrarFichaMedica() {
		if(fichaMedica == null) {
			System.out.println("No existe la ficha medica");
		}else {
			fichaMedica.mostrarFicha();
		}
	}

}
