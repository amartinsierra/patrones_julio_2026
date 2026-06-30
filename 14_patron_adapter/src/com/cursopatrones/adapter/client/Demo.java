package com.cursopatrones.adapter.client;

import com.cursopatrones.adapter.factory.MensajeFactory;

public class Demo {

	public static void main(String[] args) {
		Mensaje mensaje=MensajeFactory.crear();
		mensaje.send("envio por interfaz");

	}

}
