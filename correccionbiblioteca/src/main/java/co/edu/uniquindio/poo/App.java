import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional", "Av. Libertador 456", "3109876543");
        Biblioteca.mostrarMensaje(biblioteca.toString());

        
        Bibliotecario bibliotecario1 = new Bibliotecario("María Pérez", "67890", "3007654321", "maria.perez@gmail.com", 2200, 3);
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario1);
        Biblioteca.mostrarMensaje(bibliotecario1.toString());

        Bibliotecario bibliotecario2 = new Bibliotecario("Carlos Gómez", "98765", "3006543210", "carlos@gmail.com", 1800, 1);
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario2);
        Biblioteca.mostrarMensaje(bibliotecario2.toString());

        Bibliotecario bibliotecario3 = new Bibliotecario("Laura Torres", "54321", "3005432109", "laura@gmail.com", 2100, 5);
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario3);
        Biblioteca.mostrarMensaje(bibliotecario3.toString());

    
        Estudiante estudiante1 = new Estudiante("Pedro", "12341", "3009876523", "pedro@gmail.com", "Matemáticas", 2);
        biblioteca.agregarEstudianteABiblioteca(estudiante1);
        Biblioteca.mostrarMensaje(estudiante1.toString());

        Estudiante estudiante2 = new Estudiante("Lucía", "12342", "3009876543", "lucia@gmail.com", "Física", 1);
        biblioteca.agregarEstudianteABiblioteca(estudiante2);
        Biblioteca.mostrarMensaje(estudiante2.toString());

        Estudiante estudiante3 = new Estudiante("Andrés", "12343", "3009876545", "andres@gmail.com", "Química", 3);
        biblioteca.agregarEstudianteABiblioteca(estudiante3);
        Biblioteca.mostrarMensaje(estudiante3.toString());

     
        Libro libro1 = new Libro("321", "BB12k3456789", "Gabriel García", "El amor en los tiempos del cólera", LocalDate.now(), 10, 5);
        biblioteca.agregarLibroABiblioteca(libro1);
        Biblioteca.mostrarMensaje(libro1.toString());

        Libro libro2 = new Libro("654", "AA34m5678901", "Jorge Luis Borges", "Ficciones", LocalDate.of(2018, 6, 20), 20, 3);
        biblioteca.agregarLibroABiblioteca(libro2);
        Biblioteca.mostrarMensaje(libro2.toString());

        Libro libro3 = new Libro("987", "CC56o7890123", "Gabriel García", "Crónica de una muerte anunciada", LocalDate.of(2015, 2, 14), 5, 2);
        biblioteca.agregarLibroABiblioteca(libro3);
        Biblioteca.mostrarMensaje(libro3.toString());

        
        Prestamo prestamo1 = new Prestamo(estudiante1, 1, bibliotecario1);
        prestamo1.agregarLibro(libro1);
        Biblioteca.mostrarMensaje(prestamo1.toString());
    }
}
