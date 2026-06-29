package com.cursopatrones.good.cliente;

import com.cursopatrones.good.streaming.Reproductor;

public class GestorReproductor {
	Reproductor reproductor;
	
	public GestorReproductor(Reproductor reproductor) {
		this.reproductor = reproductor;
	}

	void reproducir() {
		reproductor.reproducir();
	}
}
