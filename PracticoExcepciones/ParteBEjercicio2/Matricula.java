package ParteBEjercicio2;

public class Matricula {
    private int numero;
    private boolean fechaVto;

    public Matricula(int numero, boolean fechaVto) {
        this.numero = numero;
        this.fechaVto = fechaVto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(boolean fechaVto) {
        this.fechaVto = fechaVto;
    }
}
