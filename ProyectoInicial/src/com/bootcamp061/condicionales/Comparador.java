package com.bootcamp061.condicionales;

import java.util.Scanner;

/**
 * javadoc
 * Clase enfocada en comparar dos numeros y determinar
 * el mas grande.
 * @author Ignaciiodev
 * 
 * */

public class Comparador {
	
	// Atributo a distancia
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String []args) {
		// No tendra en lo posible logica.
		// solo llamara metodos
		Comparador ejecucion = new Comparador();
//		ejecucion.comparaNumero();
//		ejecucion.verificaIgualdad();
//		ejecucion.operacionesLogicas();
//		ejecucion.operadorTernario();
		ejecucion.verificaDias();
	}
	
	public void comparaNumero() {
		
		System.out.println("Ingrese primer numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Ingrese segundo numero: ");
		int num2 = scanner.nextInt();
		if(num1 > num2) {
			System.out.println("Primer numero es mayor");
		}else if(num1 < num2){
			System.out.println("Segundo numero es mayor");
		}else {
			System.out.println("Ambos son iguales");
		}
		
	}
	
	/**
	 * Metodo que verifica la igualdad entre dos numeros
	 * Ingresados por usuario
	 * usando == 
	 * 5 minutos.
	 * 
	 * */
	
	public void verificaIgualdad() {
		
		
		System.out.println("Ingrese primer numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Ingrese segundo numero: ");
		int num2 = scanner.nextInt();
		
		if(num1 == num2) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros son diferentes");
		}
	}
	
	public void escolaridad() {
		System.out.print("Ingrese sus anhos de estudios: ");
		byte estudios = scanner.nextByte();
		
		if(estudios <= 6) {
			System.out.println("Nivel: Basica");
		}else if(estudios <= 12) {
			System.out.println("Nivel: Media");
		}else if(estudios <= 16) {
			System.out.println("Nivel: Universidad");
		}else {
			System.out.println("Nivel: Postgrado");
		}
		
	}
	
	
	/**
	 * Operadores logicos ( AND(&&) - OR(||) - NOT(!) )
	 * Verifiquemos si un numero esta en el rango de 1 a 10 Y  si es que es par. % mod residuo
	 * 
	 * */
	public void operacionesLogicas() {
		System.out.println("Ingres el numero");
		int numero = scanner.nextInt();
		
		if(numero >= 1 && numero <= 10 && numero % 2 == 0) {
			System.out.println("El numero esta en el rango y es par !");
		}else {
			System.out.println("El numero no cumple las condiciones");
		}
	}
	
	/**
	 * IF ternario
	 * */
	
	public void operadorTernario() {
		System.out.println("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		String resultado = (edad >= 18) ? "Puedes votar " : "No puedes votar";
		
		System.out.println(resultado);
	}
	
	/**
	 * Uso de switch, evaluamos numero para determinar el dia de la semana.
	 * */
	public void verificaDias() {
		System.out.println("Ingrese un numero de 1 al 7 y te dire el dia: ");
		int dia = scanner.nextInt();
		
		switch(dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Numero invalido, debe ser de 1 al 7...");
		}
	}
}
