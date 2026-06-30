package com.cursopatrones.factory.factoria;

import com.cursopatrones.factory.dao.ProductosDao;
import com.cursopatrones.factory.dao.ProductosDaoJdbc;
import com.cursopatrones.factory.dao.ProductosDaoJpa;
/* IMPLEMENTACION ALTERNATIVA, PERO SIN PRINCIPIOS SOLID
public class DaoFactory {
	public static ProductosDao getDao(String tipo) {
		return switch(tipo) {
			case "jdbc"->new ProductosDaoJdbc();
			case "jpa"->new ProductosDaoJpa();
			default->null;
		};
	}
}*/
