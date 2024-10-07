package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    private int prestamosRealizados;

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        this.prestamosRealizados = 0;
    }

    public void realizarPrestamo() {
        prestamosRealizados++;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }
    @Override
    public String toString() {
        return "\n Estudiante: " + nombre + "\n Cédula: " + cedula + "\n Teléfono: " + telefono + "\n Correo: " + correo+
        "\n Curso: "+curso+ "\n Prestamos realizados: " +prestamosRealizados+ "\n\n"; 
    }
} 
