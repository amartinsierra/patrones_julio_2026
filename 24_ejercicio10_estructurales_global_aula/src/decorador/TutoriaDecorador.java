package decorador;

import composite.ElementoFormacion;

public class TutoriaDecorador extends CursoDecorador {
    public TutoriaDecorador(ElementoFormacion curso) {
        super(curso);
    }

    @Override
    public void mostrar() {
        curso.mostrar();
        System.out.println("  + Incluye tutoría personalizada");
    }

    @Override
    public double getPrecio() {
        return curso.getPrecio() + 100.0; // coste extra de la tutoría
    }
}

