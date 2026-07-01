package com.cursopatrones.flyweight.cliente;

import com.cursopatrones.flyweight.factoria.UsoIVAFactory;
import com.cursopatrones.flyweight.interfaz.UsoIVA;

public class Demo {

	public static void main(String[] args) {
		double base=2000;
		UsoIVA uso=UsoIVAFactory.obtenerUso("reducido");
		System.out.println(uso.aplicarIVA(base));
		uso=UsoIVAFactory.obtenerUso("estandar");
		System.out.println(uso.aplicarIVA(base));
		uso=UsoIVAFactory.obtenerUso("estandar");
		System.out.println(uso.aplicarIVA(150));
		System.out.println(UsoIVAFactory.cache.size());
	}

}
