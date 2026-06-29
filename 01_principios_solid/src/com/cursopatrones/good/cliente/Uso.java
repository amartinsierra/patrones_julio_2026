package com.cursopatrones.good.cliente;

import com.cursopatrones.good.streaming.Musica;
import com.cursopatrones.good.streaming.Podcast;
import com.cursopatrones.good.streaming.Reproductor;
import com.cursopatrones.good.utilities.GestorDescargas;

public class Uso {

	public static void main(String[] args) {
		Musica musica=new Musica("micancion.mp3");
		Podcast podcast=new Podcast("npodcast");
		
		new GestorReproductor(musica).reproducir();
		new GestorReproductor(podcast).reproducir();
		var gestionDescargas=new GestorDescargas();
		gestionDescargas.descargar("Descargando música: "+musica.getArchivo());
		
	}
	
	

}
