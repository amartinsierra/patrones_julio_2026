package com.cursopatrones.adapter.factory;

import com.cursopatrones.adapter.adapter.Adapter;
import com.cursopatrones.adapter.client.Mensaje;
import com.cursopatrones.adapter.legacy.Info;

public class MensajeFactory {
	public static Mensaje crear() {
		return new Adapter(new Info());
	}
}
