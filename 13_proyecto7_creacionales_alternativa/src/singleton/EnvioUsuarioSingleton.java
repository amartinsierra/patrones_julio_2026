package singleton;

import model.Usuario;

public enum EnvioUsuarioSingleton {
    INSTANCE;
    public void enviarUsusario(Usuario usuario) {
        System.out.println("Enviando usuario: " + usuario);
    }
}

