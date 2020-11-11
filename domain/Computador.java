package quiz3.domain;

public class Computador extends Recurso implements Prestable {
    public Computador (String nombre, boolean prestado){
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
