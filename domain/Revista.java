package quiz3.domain;

public class Revista extends Recurso implements Prestable{
    public Revista(String nombre, boolean prestado){
        super(nombre, prestado);
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
