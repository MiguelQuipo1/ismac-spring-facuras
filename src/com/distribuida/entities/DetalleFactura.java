package com.distribuida.entities;

public class DetalleFactura {
	
	//Skills
	
	private int idDetalleFactura;
	private int cantidad;
	private float detalleFactura;
	
	//Skills Class
	
	private Facturas factura;
	private Producto producto;
	
	//Constructor
	
	public DetalleFactura() {}
	
	//Methods Getter and Setter
	
	public int getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(int idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getDetalleFactura() {
		return detalleFactura;
	}

	public void setDetalleFactura(float detalleFactura) {
		this.detalleFactura = detalleFactura;
	}
	public 	Facturas getFacturas () {
		return factura;
	}
	
	public void setFacturas(Facturas factura) {
		this.factura = factura;
	}
	public 	Producto getProducto () {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleFactura [idDetalleFactura=" + idDetalleFactura + ", cantidad=" + cantidad + ", detalleFactura="
				+ detalleFactura + "]";
	}
	
	
	
}
