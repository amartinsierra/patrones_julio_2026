package model;

import singleton.EnvioUsuarioSingleton;

public class Invitado extends Usuario {
	private Invitado(Builder builder) {
        super(builder.nombre, builder.email);
    }

    @Override
    public String getTipoUsuario() {
        return "Invitado";
    }

    @Override
    public void enviarUsuario() {
        EnvioUsuarioSingleton.INSTANCE.enviarUsusario(this);
    }

    public static class Builder {
        private String nombre;
        private String email;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Invitado build() {
            return new Invitado(this);
        }
    }

}
