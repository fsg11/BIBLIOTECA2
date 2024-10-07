package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private Libro libro;
    private int cantidadPrestada;

    public DetallePrestamo(Libro libro, int cantidadPrestada) {
        this.libro = libro;
        this.cantidadPrestada = cantidadPrestada;
    }

    public int getCantidadPrestada() {
        return cantidadPrestada;
    }
    @Override
    public String toString() {
        return "Detalle Prestamo:\n Libro: " + libro + "\n Cantidad Prestamos Libros: " + cantidadPrestamosLibros;
    } 
}    

