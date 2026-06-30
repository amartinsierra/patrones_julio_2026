package com.cursopatrones.factory.cliente;

import com.cursopatrones.factory.dao.ProductosDao;
import com.cursopatrones.factory.factoria.ProductosDaoFactory;
import com.cursopatrones.factory.factoria.ProductosDaoJdbcFactory;
import com.cursopatrones.factory.model.Producto;

public class Demo {

	public static void main(String[] args) {
		ProductosDaoFactory daoFactory=new ProductosDaoJdbcFactory();
		ProductosDao productosDao=daoFactory.crear();
		productosDao.findAll();
		productosDao.save(new Producto());

	}

}
