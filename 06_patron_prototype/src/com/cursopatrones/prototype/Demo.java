package com.cursopatrones.prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Libro prototipo=new Libro("titulo 1","11111W","varios",new ArrayList<String>(List.of("Navidad","Black Friday")));
		Libro l1=prototipo.clone();
		l1.setIsbn("2222d");
		l1.getPromociones().add("verano");
		Libro l2=prototipo.clone();
		l2.setIsbn("3e444");
		System.out.println(l1);
		System.out.println(l2);
	}

}
