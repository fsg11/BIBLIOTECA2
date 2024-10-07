package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Prestamo {
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private ArrayList<Libro> libros;

    public Prestamo(Estudiante estudiante, Bibliotecario bibliotecario) {
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro.getUnidadesDisponibles() > 0) {
            libros.add(libro);
            libro.registrarPrestamo();
            estudiante.realizarPrestamo();
            bibliotecario.realizarPrestamo();
        }
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
}
