package service;

import composite.Categoria;
import composite.Curso;
import composite.ElementoFormacion;
import decorador.CertificadoDecorador;
import decorador.TutoriaDecorador;
import flyweight.Factory;

public class FormacionService {
	public Curso crearCurso(String nombre, double precio,String aula, int capacidad) {
		return new Curso(nombre, precio,Factory.getAula(aula, capacidad));
	}
	public ElementoFormacion crearCursoTutoria(ElementoFormacion curso) {
		return new TutoriaDecorador(curso);
	}
	public ElementoFormacion crearCursoCertificado(ElementoFormacion curso) {
		return new CertificadoDecorador(curso);
	}
	public Categoria crearCategoria(String nombre, ElementoFormacion... componentes) {
		Categoria categoria=new Categoria(nombre);
		for(ElementoFormacion curso:componentes) {
			categoria.agregar(curso);
		}
		return categoria;
	}
}
