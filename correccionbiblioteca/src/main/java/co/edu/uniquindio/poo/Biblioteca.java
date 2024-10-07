package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    private ArrayList<Bibliotecario> bibliotecarios;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        bibliotecarios = new ArrayList<>();
        estudiantes = new ArrayList<>();
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public int consultarPrestamosPorNombreDeLibro(String nombreLibro) {
        int contador = 0;
        for (Prestamo prestamo : prestamos) {
            for (Libro libro : prestamo.getLibros()) {
                if (libro.getTitulo().equalsIgnoreCase(nombreLibro)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public Estudiante obtenerEstudianteConMasPrestamos() {
        Estudiante estudianteConMasPrestamos = null;
        int maxPrestamos = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPrestamosRealizados() > maxPrestamos) {
                maxPrestamos = estudiante.getPrestamosRealizados();
                estudianteConMasPrestamos = estudiante;
            }
        }
        return estudianteConMasPrestamos;
    }

    public double totalAPagarBibliotecarios() {
        double total = 0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            total += bibliotecario.calcularTotalPagar(10000); 
        }
        return total;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
}
