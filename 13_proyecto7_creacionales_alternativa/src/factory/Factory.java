package factory;

import model.Usuario;

public interface Factory {
	Usuario create(String name, String email);
}
