package com.cursopatrones.factory.factoria;

import com.cursopatrones.factory.dao.ProductosDao;
import com.cursopatrones.factory.dao.ProductosDaoJpa;

public class ProductosDaoJpaFactory implements ProductosDaoFactory {

	@Override
	public ProductosDao crear() {
		// operaciones complejas
		return new ProductosDaoJpa();
	}

}
