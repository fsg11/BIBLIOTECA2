package co.edu.uniquindio.poo;

public class Editorial {
    private String nombre;
    private String telefono;
    private String correo;

    public Editorial(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Editorial: " + nombre + "\n Los libros Publicados: " + librosPublicados;
    }
    
}
