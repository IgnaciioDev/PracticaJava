package com.bootcamp061.pacientes;

public class Persona {
	// Atributo privado
	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	public Persona(String nombre, int edad, double peso, double altura) { // constructores
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	// Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Metodo para calcular imc
	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	public String calificarIMC() {
		double imc = calcularIMC();
		if(imc < 18.5) {
			return "bajo";
		}else if (imc >= 18.5 && imc < 24.9){
			return "Normal";
		}else if(imc >= 24.9 && imc < 29.9) {
			return "Sobrepeso";
		}else {
			return "Esto en obesidad";
		}
	}
	
	public boolean esMayorEdad() {
		return edad >= 18;
	}
	
	
	public void mostrarPersona() {
		System.out.println("nombre " + nombre);
		System.out.println("Edad " + edad);
		System.out.println("Peso " + peso);
	}
	
}
