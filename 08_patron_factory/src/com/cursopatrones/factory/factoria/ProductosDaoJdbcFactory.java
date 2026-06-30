package com.cursopatrones.factory.factoria;

import com.cursopatrones.factory.dao.ProductosDao;
import com.cursopatrones.factory.dao.ProductosDaoJdbc;

public class ProductosDaoJdbcFactory implements ProductosDaoFactory {

	@Override
	public ProductosDao crear() {
		// operaciones complejas
		return new ProductosDaoJdbc();
	}

}
