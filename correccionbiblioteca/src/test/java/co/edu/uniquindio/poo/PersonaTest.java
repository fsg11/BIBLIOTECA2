package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    private Persona persona;

    @BeforeEach
    public void setUp() {
        persona = new Persona("Persona Prueba", "12345", "555-1234", "persona@mail.com");
    }

    @Test
    public void testDatosPersona() {
        assertEquals("Persona Prueba", persona.getNombre());
    }
}
