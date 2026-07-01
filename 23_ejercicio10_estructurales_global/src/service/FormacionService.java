package service;

import composite.Categoria;
import composite.Curso;
import composite.ElementoFormacion;
import decorador.CertificadoDecorador;
import decorador.TutoriaDecorador;

public class FormacionService {
	public Curso crearCurso(String nombre, double precio) {
		return new Curso(nombre, precio);
	}
	public ElementoFormacion crearCursoTutoria(String nombre, double precio) {
		return new TutoriaDecorador(crearCurso(nombre,precio));
	}
	public ElementoFormacion crearCursoCertificado(String nombre, double precio) {
		return new CertificadoDecorador(crearCurso(nombre,precio));
	}
	public Categoria crearCategoria(String nombre, ElementoFormacion... componentes) {
		Categoria categoria=new Categoria(nombre);
		for(ElementoFormacion curso:componentes) {
			categoria.agregar(curso);
		}
		return categoria;
	}
}
