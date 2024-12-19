package com.bootcamp061.entidades;

public class Ejecutor {

	public static void main(String[] args) {
		
		// Usando el constructor por defecto
		// o constructor vacio
		
		
		
		Vehiculo vehiculo1 = new Vehiculo();
		
		vehiculo1.setMarca("Mitsubishi");
		vehiculo1.setModelo("Outlander");
		vehiculo1.setAnho(2024);
		
		// Crear objeto con constructor
		Vehiculo vehiculoX = new Vehiculo("Peugeot", "5008", 2024);
		
		
		vehiculo1.encenderMotor();
		vehiculo1.frenar();
		
		int temperatura = vehiculo1.devolverTemperatura();
		System.out.println(temperatura);
	}

}
