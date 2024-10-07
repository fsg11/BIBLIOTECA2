package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrestamoTest {

    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private Libro libro;
    private Prestamo prestamo;

    @BeforeEach
    public void setUp() {
        estudiante = new Estudiante("Maria", "456", "555-5678", "maria@mail.com");
        bibliotecario = new Bibliotecario("Juan", "123", "555-1234", "juan@mail.com", 2000, 5);
        libro = new Libro("001", "978-3-16-148410-0", "Autor 1", "Libro Ejemplo", "Editorial X", "2020", 5);
        prestamo = new Prestamo(estudiante, bibliotecario);
    }

    @Test
    public void testAgregarLibro() {
        prestamo.agregarLibro(libro);
        assertEquals(1, libro.getCantidadPrestamos());
        assertEquals(1, estudiante.getPrestamosRealizados());
        assertEquals(1, bibliotecario.getPrestamosRealizados());
    }
}
