package com.distribuida.entities;

public class Clientes {
//Atributos
	private int idCliente;
	private int cedula;
	private String nombre;
	private String Apellido;
	private int edad;
	private String fechaNacimiento;
	private String direccion;
	private int telefono;
	private String correo;
	
//Constructor
	
	public Clientes () {
		
	}
//Metodos Getter and Setter

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", Apellido="
				+ Apellido + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	
}
