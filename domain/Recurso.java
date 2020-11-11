package quiz3.domain;

public abstract class Recurso {
    protected boolean prestado;
    protected String nombre;

    public Recurso(String nombre, boolean prestado) {
        this.nombre = nombre;
        this.prestado = prestado;
    }

    public Recurso(String nombre) {

    }

    @Override
    public String toString() {
        String a;
        if (prestado == false){
            a = "Disponible";
        }
        else {
            a = "Prestado";
        }
        return (getNombre() + a);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
