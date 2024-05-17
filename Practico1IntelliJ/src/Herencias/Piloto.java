package Herencias;

public class Piloto extends Persona implements Volador {
    private int horasDeVuelo;
    private String numLicencia;

    public Piloto(int horasDeVuelo, String numLicencia) {
        this.horasDeVuelo = horasDeVuelo;
        this.numLicencia = numLicencia;
    }

    public Piloto(int edad, String genero, String nombre, int horasDeVuelo, String numLicencia) {
        super(edad, genero, nombre);
        this.horasDeVuelo = horasDeVuelo;
        this.numLicencia = numLicencia;
    }

    public int getHorasDeVuelo() {
        return horasDeVuelo;
    }

    public void setHorasDeVuelo(int horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    @Override
    public void volar() {
        System.out.println("Mi avion es un Boeing 737");
    }
    public void horasVuelo(){
        System.out.println("Mi total de horas en vuelo son: " + getHorasDeVuelo());
    }
}
