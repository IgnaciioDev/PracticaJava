package com.bootcamp061.entidades;

public class FichaMedica {
	// Atributos privados
	private Persona persona;
	private String sanguinio;
	private double peso;
	private double altura;
	public FichaMedica(Persona persona, String sanguinio, double peso, double altura) { // Constructor
		super();
		this.persona = persona;
		this.sanguinio = sanguinio;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void mostrarFicha() {
		System.out.println("**** FICHA MEDICA ****");
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Direccion: " + persona.getDireccion());
		System.out.println("======================");
		System.out.println("Grupo sanguinio " + sanguinio);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
	}
}
