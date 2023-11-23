package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cliente cliente = context.getBean("idCliente",Cliente.class);
		
		Producto producto = context.getBean("idProducto",Producto.class);
		
		Factura factura = context.getBean("idFactura",Factura.class);
		
		DetalleFactura facturaDetalle = context.getBean("idFacturaDetalle", DetalleFactura.class);

		
		
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


		
		//FACTURA DETALLE
		facturaDetalle.setCantidad(2);
		producto.setStock(producto.getStock()
				-facturaDetalle.getCantidad());
		facturaDetalle.setIdDetalleFactura(1);

		//FACTURAS
	
		factura.setFecha("16/11/2023");
		factura.setIdFactura(1);
		factura.setIva(1.12);
		factura.setTotalNeto(producto.getPrecio()*
				facturaDetalle.getCantidad()+
				producto.getPrecio()*
				facturaDetalle.getCantidad()
				+producto.getPrecio()
				*facturaDetalle.getCantidad());
		
		factura.setTotal(factura.getTotalNeto()
				*factura.getIva());
		
		System.out.println(factura.toString());
		System.out.println(facturaDetalle.toString());
		
		
		context.close();
	}

}
