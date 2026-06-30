package model;

import singleton.EnvioUsuarioSingleton;

public class Operador extends Usuario {
	private int categoria;
	private Operador(Builder builder) {
        super(builder.nombre, builder.email);
    }

    @Override
    public String getTipoUsuario() {
        return "Operador";
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

        public Operador build() {
            return new Operador(this);
        }
    }

	//otros métodos específicos de la clase
	public void establecerProtocolo() {
		
	}
}

