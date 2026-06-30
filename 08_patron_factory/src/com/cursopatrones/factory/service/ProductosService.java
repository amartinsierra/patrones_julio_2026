package com.cursopatrones.factory.service;

import java.util.List;

import com.cursopatrones.factory.dao.ProductosDao;
import com.cursopatrones.factory.model.Producto;

public class ProductosService {
	private ProductosDao productosDao;

	public ProductosService(ProductosDao productosDao) {
		this.productosDao = productosDao;
	}
	
	public List<Producto> obtenerProductos(){
		return productosDao.findAll();
	}
}
