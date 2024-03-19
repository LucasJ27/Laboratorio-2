package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String fechaVuelo;
    private String horarioVuelo;
    private String numeroVuelo;
    private Avion avion; // La referencia al Avion asociado con este Vuelo

    // Constructor
    public Vuelo(String fechaVuelo, String horarioVuelo, String numeroVuelo) {
        this.fechaVuelo = fechaVuelo;
        this.horarioVuelo = horarioVuelo;
        this.numeroVuelo = numeroVuelo;
    }

    // Getters y setters
    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public String getHorarioVuelo() {
        return horarioVuelo;
    }

    public void setHorarioVuelo(String horarioVuelo) {
        this.horarioVuelo = horarioVuelo;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    public Avion getAvion() {
        return avion;
    }
}
