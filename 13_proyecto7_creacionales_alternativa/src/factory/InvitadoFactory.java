package factory;

import model.Invitado;
import model.Usuario;

public class InvitadoFactory implements Factory {

	public Usuario create(String name, String email) {
        return new Invitado.Builder()
                .setNombre(name)
                .setEmail(email)
                .build();
    }


}
