package quiz3.domain;

public class Libro extends Recurso implements Prestable{
    public Libro (String nombre, boolean prestado) {
        super (nombre, prestado);
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }
}
