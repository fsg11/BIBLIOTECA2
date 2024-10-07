package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EditorialTest {

    private Editorial editorial;

    @BeforeEach
    public void setUp() {
        editorial = new Editorial("Editorial X", "555-9876", "editorial@mail.com");
    }

    @Test
    public void testDatosEditorial() {
        assertEquals("Editorial X", editorial.getNombre());
    }
}
