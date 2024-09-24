package com.dam.quique;

public class Vehiculos {
	
	private String marca;
	private String tipo;
	private String modelo;
	private String motor;



 public Vehiculos(String marca, String tipo, String modelo,String motor) {
	 
	this.marca = marca;
	this.tipo = tipo;
	this.modelo = modelo;
	this.motor = motor;

}



public String getMarca() {
	return marca;
}



public void setMarca(String marca) {
	this.marca = marca;
}



public String getTipo() {
	return tipo;
}



public void setTipo(String tipo) {
	this.tipo = tipo;
}



public String getModelo() {
	return modelo;
}



public void setModelo(String modelo) {
	this.modelo = modelo;
}



public String getMotor() {
	return motor;
}



public void setMotor(String motor) {
	this.motor = motor;
}



@Override
public String toString() {
	return "Vehiculos [marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", motor=" + motor + "]";
}
 
 
 
 
}
