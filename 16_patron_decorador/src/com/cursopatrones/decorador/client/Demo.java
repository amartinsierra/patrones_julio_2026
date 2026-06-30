package com.cursopatrones.decorador.client;

import com.cursopatrones.decorador.decorado.OrdenadorEstandar;
import com.cursopatrones.decorador.decorador.DecoradorDisco;
import com.cursopatrones.decorador.interfaz.Ordenador;

public class Demo {

	public static void main(String[] args) {
		Ordenador ordenador=new OrdenadorEstandar();
		System.out.println("Sin decorar "+ordenador.getDescripcion());
		System.out.println("Sin decorar "+ordenador.getPrecio());
		//modifica el componente aplicando un decorador
		ordenador=new DecoradorDisco(ordenador);
		System.out.println("Decorado "+ordenador.getDescripcion());
		System.out.println("Decorado "+ordenador.getPrecio());


	}

}
