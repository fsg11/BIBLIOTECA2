package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    private Libro libro;

    @BeforeEach
    public void setUp() {
        libro = new Libro("001", "978-3-16-148410-0", "Autor 1", "Libro Ejemplo", "Editorial X", "2020", 5);
    }

    @Test
    public void testRegistrarPrestamo() {
        libro.registrarPrestamo();
        assertEquals(1, libro.getCantidadPrestamos());
    }

    @Test
    public void testUnidadesDisponibles() {
        assertEquals(5, libro.getUnidadesDisponibles());
    }
}
