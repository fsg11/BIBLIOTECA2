package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

    private Estudiante estudiante;

    @BeforeEach
    public void setUp() {
        estudiante = new Estudiante("Maria", "456", "555-5678", "maria@mail.com");
    }

    @Test
    public void testAgregarPrestamo() {
        estudiante.realizarPrestamo();
        assertEquals(1, estudiante.getPrestamosRealizados());
    }
}
