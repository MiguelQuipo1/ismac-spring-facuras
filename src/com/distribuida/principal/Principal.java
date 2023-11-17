package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Clientes;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Facturas;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Clientes cliente = context.getBean("idCliente",Clientes.class);
		
		Producto producto = context.getBean("idProducto",Producto.class);
		Producto producto1 = context.getBean("idProducto1",Producto.class);
		Producto producto2 = context.getBean("idProducto2",Producto.class);
		
		Facturas factura = context.getBean("idFactura",Facturas.class);
		
		DetalleFactura facturaDetalle = context.getBean("idFacturaDetalle", DetalleFactura.class);
		DetalleFactura facturaDetalle1 = context.getBean("idFacturaDetalle2", DetalleFactura.class);
		DetalleFactura facturaDetalle2 = context.getBean("idFacturaDetalle3", DetalleFactura.class);
		
		
		//CLIENTES
		cliente.setIdCliente(1);
		cliente.setCedula(1754720579);
		cliente.setNombre("Miguel Quipo");
		cliente.setDireccion("Quito, Pifo");
		cliente.setTelefono(980537741);
		cliente.setCorreo("miguel1234@gmail.com");
		cliente.setEdad(20);
		cliente.setFechaNacimiento("02/10/2000");
		
		//PRODUCTOS
		producto.setIdProducto(1);
		producto.setNombre("Laptop HP");
		producto.setDescripcion("AB sertify");
		producto.setPrecio(1200.50);
		producto.setStock(100);
		
		producto1.setIdProducto(2);
		producto1.setNombre("Mouse RGB");
		producto1.setDescripcion("AB sertify");
		producto1.setPrecio(20.60);
		producto1.setStock(100);
		
		producto2.setIdProducto(3);
		producto2.setNombre("Teclado Mecanico");
		producto2.setDescripcion("AB sertify");
		producto2.setPrecio(40.60);
		producto2.setStock(100);
		
		//FACTURA DETALLE
		facturaDetalle.setCantidad(2);
		producto.setStock(producto.getStock()
				-facturaDetalle.getCantidad());
		facturaDetalle.setIdDetalleFactura(1);
		facturaDetalle.setFacturas(factura);
		facturaDetalle.setProducto(producto);
		
		facturaDetalle1.setCantidad(2);
		producto1.setStock(producto1.getStock()
				-facturaDetalle1.getCantidad());
		facturaDetalle1.setIdDetalleFactura(1);
		facturaDetalle1.setFacturas(factura);
		facturaDetalle1.setProducto(producto1);
		
		facturaDetalle2.setCantidad(2);
		producto2.setStock(producto2.getStock()
				-facturaDetalle2.getCantidad());
		facturaDetalle2.setIdDetalleFactura(1);
		facturaDetalle2.setFacturas(factura);
		facturaDetalle2.setProducto(producto2);
		
		//FACTURAS
		factura.setClientes(cliente);
		factura.setFecha("16/11/2023");
		factura.setIdFactura(1);
		factura.setIva(1.12);
		factura.setTotalNeto(producto.getPrecio()*
				facturaDetalle.getCantidad()+
				producto1.getPrecio()*
				facturaDetalle1.getCantidad()
				+producto2.getPrecio()
				*facturaDetalle2.getCantidad());
		
		factura.setTotal(factura.getTotalNeto()
				*factura.getIva());

		
	}

}
