package com.cursopatrones.builder;

public class Demo {

	public static void main(String[] args) {
		Conector conector=new Conector.ConectorBuilder()
			    .dir("prueba")
			    .estado(true)
			    .protocolo("http")
			    .build();

	}

}
