package factory;

import model.Operador;
import model.Usuario;

public class OperadorFactory implements Factory {

	public Usuario create(String name, String email) {
        return new Operador.Builder()
                .setNombre(name)
                .setEmail(email)
                .build();
    }


}
