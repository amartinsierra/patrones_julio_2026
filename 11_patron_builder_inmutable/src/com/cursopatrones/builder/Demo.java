package com.cursopatrones.builder;

public class Demo {

	public static void main(String[] args) {
		Conector conector=new Conector.Builder()
			    .dir("prueba")
			    .estado(true)
			    .protocolo("http")
			    .build();

	}

}
