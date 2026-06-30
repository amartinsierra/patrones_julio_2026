package com.cursopatrones.factory.factoria;

import com.cursopatrones.factory.dao.ProductosDao;

public interface ProductosDaoFactory {
	ProductosDao crear();
}
