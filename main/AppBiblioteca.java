package quiz3.main;

import quiz3.domain.*;

import java.util.ArrayList;

public class AppBiblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro ("Libro", false);
        Revista revista = new Revista ("Revista", false);
        Tesis tesis = new Tesis("Tesis", false);
        Computador computador = new Computador("Computador", false);
        Taller taller = new Taller("Taller", false);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.AdiccionarRecurso(libro);
        biblioteca.AdiccionarRecurso(revista);
        biblioteca.AdiccionarRecurso(tesis);
        biblioteca.AdiccionarRecurso(computador);
        biblioteca.AdiccionarRecurso(taller);

        System.out.println(biblioteca.prestar(libro));
        System.out.println(biblioteca.prestar(revista));
        System.out.println(biblioteca.prestar(computador));

        biblioteca.listar();
    }
}
