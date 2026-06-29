package com.cursopatrones.singleton;

public class Demo {

	public static void main(String[] args) {
		LoggerSingleton l1=LoggerSingleton.getInstance();
		LoggerSingleton l2=LoggerSingleton.getInstance();
		System.out.println(l1==l2);

	}

}
