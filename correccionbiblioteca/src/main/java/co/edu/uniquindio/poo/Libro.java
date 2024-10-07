package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Libro {
    private String codigo;
    private String isbn;
    private String autor;
    private String titulo;
    private String editorial;
    private String fecha;
    private int unidadesDisponibles;
    private int cantidadPrestamos;

    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, String fecha, int unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
        this.cantidadPrestamos = 0;
    }

    public void registrarPrestamo() {
        if (unidadesDisponibles > 0) {
            unidadesDisponibles--;
            cantidadPrestamos++;
        }
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }
    @Override
    public String toString() {
        return "\n Código del libro: " + codigo + "\n isbn: " + isbn + "\n Autor: " + autor + "\n Titulo: " + titulo + "\n Fecha: "
                + fecha + "\n Unidades Disponibles: " + unidadesDisponibles+ "\n Prestamos contados: "+prestamosContados+ "\n\n"; 
    }

