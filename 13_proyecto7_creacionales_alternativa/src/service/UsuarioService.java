package service;

import factory.Factory;
import factory.FactoryRegistry;
import model.Usuario;

public class UsuarioService {
	public void enviarUsuario(String tipo, String nombre, String email) {
        Factory factory = FactoryRegistry.getFactory(tipo);

        if (factory == null) {
            throw new IllegalArgumentException("Tipo no soportado");
        }

       Usuario usuario = factory.create(nombre, email);
       usuario.enviarUsuario();
    }

}
