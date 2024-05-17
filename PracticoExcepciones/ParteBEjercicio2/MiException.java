package ParteBEjercicio2;

public class MiException extends Exception {
    private String nombreObjeto;

    public MiException(String mensaje, String nombreObjeto) {
        super(mensaje);
        this.nombreObjeto = nombreObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }
}