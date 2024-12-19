package com.bootcamp061.entidades;

public class Vehiculo {
	
	// Atributos de la clase encapsulamiento
	private String marca;
	private String modelo;
	private int anho;
	
	// Constructor explicito, aqui dentro se puede aplicar logica es decir ejem if() o while etc
	public Vehiculo(String marca, String modelo, int anho) {
		this.marca = marca;
		this.modelo = modelo;
		this.anho = anho;
	}
	
	public Vehiculo() {
		
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	// Comportamiento
	public void encenderMotor() {
		System.out.println("Encendiendo motor... Encendido");
	}
	
	public void frenar() {
		System.out.println("Frenando el vehiculo");
	}
	
	public int devolverTemperatura() {
		return 30;
	}
}
