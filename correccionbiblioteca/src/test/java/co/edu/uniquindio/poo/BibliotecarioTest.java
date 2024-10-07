package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecarioTest {

    private Bibliotecario bibliotecario;

    @BeforeEach
    public void setUp() {
        bibliotecario = new Bibliotecario("Juan", "123", "555-1234", "juan@mail.com", 2000, 5);
    }

    @Test
    public void testCalcularTotalPagar() {
        double total = bibliotecario.calcularTotalPagar(10000);
        assertEquals(2200, total, 0.01);
    }

    @Test
    public void testAgregarPrestamo() {
        bibliotecario.realizarPrestamo();
        assertEquals(1, bibliotecario.getPrestamosRealizados());
    }
}
