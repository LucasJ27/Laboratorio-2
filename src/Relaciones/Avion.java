package Relaciones;

public class Avion {
    private int capacidad;
    private String modelo;
    private Vuelo vuelo;
    public Avion(int capacidad, String modelo) {
        this.capacidad = capacidad;
        this.modelo = modelo;
    }
    public Avion(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }


}
