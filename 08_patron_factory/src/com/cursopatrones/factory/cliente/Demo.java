package com.cursopatrones.factory.cliente;

import com.cursopatrones.factory.factoria.FactoryRegistry;
import com.cursopatrones.factory.factoria.ProductosDaoFactory;
import com.cursopatrones.factory.service.ProductosService;

public class Demo {

	public static void main(String[] args) {
		ProductosDaoFactory daoFactory=FactoryRegistry.getFactory("jdbc");
		var productosService=new ProductosService(daoFactory.crear());
		productosService.obtenerProductos();

	}

}
