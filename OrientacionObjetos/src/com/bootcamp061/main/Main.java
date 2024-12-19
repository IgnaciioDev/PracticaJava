package com.bootcamp061.main;

import java.util.Scanner;

import com.bootcamp061.pacientes.Persona;

public class Main {

	// Clases para usar constructores
	private static Persona persona;
	private static Scanner scanner = new Scanner(System.in);

	
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("***********************");
            System.out.println("***      MENU       ***");
            System.out.println("***********************");

            System.out.println("  1- Ingrese sus datos ");
            System.out.println("  2- Salir ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // resetea el scanner

            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Ingrese opción válida, inténtelo de nuevo");
            }

        } while (opcion != 2);
    }
	
	
	public static void crearPersona() {
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		System.out.println("Ingrese su peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Ingrese su altura: ");
		double altura = scanner.nextDouble();
		
		persona = new Persona(nombre, edad, peso, altura);
		
		
		// Calcula y muestra el IMC y sus resultados
	    System.out.println(persona.getNombre() + ": Calculando su IMC...");
	    double imc = persona.calcularIMC();
	    System.out.printf("Su índice de masa corporal es: %.2f\n", imc);
	    System.out.println("Usted se encuentra en un peso: " + persona.calificarIMC());

	    // Verifica si es mayor de edad
	    if (persona.esMayorEdad()) {
	        System.out.println("Su edad es: " + persona.getEdad() + ", usted es mayor de edad.");
	    } else {
	        System.out.println("Su edad es: " + persona.getEdad() + ", usted es menor de edad.");
	    }

	    // Muestra el resumen de los datos de la persona
	    System.out.println("Persona[nombre=" + persona.getNombre() + ", edad=" + persona.getEdad() +
	            ", peso=" + persona.getPeso() + ", altura=" + persona.getAltura() + "]");
	}

}
