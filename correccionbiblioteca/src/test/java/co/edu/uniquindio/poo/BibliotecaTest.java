package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void testAgregarLibro() {
        Libro libro = new Libro("001", "978-3-16-148410-0", "Autor 1", "Libro Ejemplo", "Editorial X", "2020", 5);
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.getLibros().contains(libro));
    }

    @Test
    public void testConsultarPrestamosPorNombreDeLibro() {
        Libro libro = new Libro("001", "978-3-16-148410-0", "Autor 1", "Libro Ejemplo", "Editorial X", "2020", 5);
        Prestamo prestamo = new Prestamo(new Estudiante(), new Bibliotecario());
        prestamo.agregarLibro(libro);
        biblioteca.agregarPrestamo(prestamo);
        assertEquals(1, biblioteca.consultarPrestamosPorNombreDeLibro("Libro Ejemplo"));
    }
}
