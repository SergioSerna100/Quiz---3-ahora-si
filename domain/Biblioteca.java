package quiz3.domain;

import java.util.ArrayList;

public class Biblioteca {

    public ArrayList <Recurso> recursos;
    public Biblioteca() {
        recursos = new ArrayList<Recurso>();
    }

    public void AdiccionarRecurso(Recurso r) {
        recursos.add(r);
    }

    public boolean prestar(Prestable r) {
        boolean se_presto=false;
        r.prestar();
        if(r instanceof Recurso) {
            if(((Recurso) r).isPrestado()==true) {
                se_presto=true;
            }
        }
        return se_presto;
    }

    public boolean devolver(Prestable r) {
        boolean devolver=false;
        r.devolver();
        if(r instanceof Recurso) {
            if(((Recurso) r).isPrestado()==false) {
                devolver=true;
            }
        }
        return devolver;
    }

    public void listar() {
        for (Recurso recurso : recursos) {
            if(recurso.prestado==true) {
                System.out.println(recurso.nombre);
            }
        }
    }
}
