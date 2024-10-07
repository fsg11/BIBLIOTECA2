package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DetallePrestamoTest {

    private DetallePrestamo detallePrestamo;

    @BeforeEach
    public void setUp() {
        detallePrestamo = new DetallePrestamo(new Libro(), 1);
    }

    @Test
    public void testCantidadPrestada() {
        assertEquals(1, detallePrestamo.getCantidadPrestada());
    }
}
