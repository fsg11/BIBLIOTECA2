package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;
    private int aniosAntiguedad;
    private int prestamosRealizados;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario, int aniosAntiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.aniosAntiguedad = aniosAntiguedad;
        this.prestamosRealizados = 0;
    }

    public double calcularTotalPagar(double valorPrestamo) {
        double comision = valorPrestamo * 0.2; // 20%
        double bonificacion = comision * 0.02 * aniosAntiguedad;
        return comision + bonificacion;
    }

    public void realizarPrestamo() {
        prestamosRealizados++;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }
    @Override
    public String toString() {
        return " \n Bibliotecario: " + nombre + "\n Salario: " + salario + "\n Cédula: " + cedula + "\n Teléfono: "+ telefono + "\n Correo: " + correo+
         "\n Prestamos realizados: " +prestamosRealizados+ "\n Antiguedad: "+antiguedad+ "\n\n"; 
    }
}
