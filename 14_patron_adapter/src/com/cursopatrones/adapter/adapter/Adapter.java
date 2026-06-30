package com.cursopatrones.adapter.adapter;

import com.cursopatrones.adapter.client.Mensaje;
import com.cursopatrones.adapter.legacy.Info;

public class Adapter implements Mensaje {

	private Info info;
    public Adapter(Info info){
        this.info=info;
    }
    @Override
    public void send(String texto){
        //info.setTexto(texto);
        info.save(texto);
        info.register(texto);
    }


}
