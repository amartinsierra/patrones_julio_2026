package com.cursopatrones.prototype;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Cloneable{
	private String titulo;
    private String isbn;
    private String autor;
    private ArrayList<String> promociones;
    
    
    public Libro(String titulo, String isbn, String autor, ArrayList<String> promociones) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.promociones = promociones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

	public List<String> getPromociones() {
		return promociones;
	}

	public void setPromociones(ArrayList<String> promociones) {
		this.promociones = promociones;
	}

	//getter setter
    @Override 
    public Libro clone() {
        try {
            //llamada al método clone() heredado de Object
            Libro clon=(Libro)super.clone();
            clon.setPromociones(new ArrayList<>(this.promociones));
            return clon;
        }catch(CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", promociones="+promociones+"]";
    }   

}
