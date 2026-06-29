package com.cursopatrones.good.cliente;

import com.cursopatrones.good.media.Cancion;
import com.cursopatrones.good.media.Demo;
import com.cursopatrones.good.media.Videojuego;
import com.cursopatrones.good.service.Carrito;
import com.cursopatrones.good.utilities.CalculadoraImpuestos;

public class Main {

	public static void main(String[] args) {
		var carrito=new Carrito();
		carrito.agregarProducto(new Cancion("c1",5,4));
		carrito.agregarProducto(new Cancion("c2",10,3));
		carrito.agregarProducto(new Videojuego("v1",30,740));
		carrito.mostrarCarrito();
		System.out.println("Total: "+carrito.calcularTotal(new CalculadoraImpuestos(21)));
		

	}
	
	void reproducirDemos(Demo demo) {
		demo.reproducirDemo();
	}

}
