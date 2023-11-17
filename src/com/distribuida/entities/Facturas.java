package com.distribuida.entities;

public class Facturas {

	//Skills
	private int idFactura;
	private String fecha;
	private double totalNeto;
	private double iva;
	private double total;
	
	private Clientes cliente; 
	
	//Constructor
	public Facturas() {
		
	}

	
	//Methods Getter and Setter
	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(double totalNeto) {
		this.totalNeto = totalNeto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public 	Clientes getClientes () {
		return cliente;
	}
	
	public void setClientes(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Facturas [idFactura=" + idFactura + ", fecha=" + fecha + ", totalNeto=" + totalNeto + ", iva=" + iva
				+ ", total=" + total + ", clientes=" + cliente + "]";
	}
	

	
	
	
}
