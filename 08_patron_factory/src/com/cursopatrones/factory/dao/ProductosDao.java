package com.cursopatrones.factory.dao;

import java.util.List;

import com.cursopatrones.factory.model.Producto;

public interface ProductosDao {
	Producto save(Producto producto);
	List<Producto> findAll();
}
