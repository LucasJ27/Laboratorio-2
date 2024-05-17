package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private String nombreFlota;
    private List<Avion> aviones;

    public Flota(String nombreFlota) {
        this.nombreFlota = nombreFlota;
        this.aviones = new ArrayList<>();
    }

    public String getNombreFlota() {
        return nombreFlota;
    }

    public void setNombreFlota(String nombreFlota) {
        this.nombreFlota = nombreFlota;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    public void agregarAvion(Avion avion) {

        aviones.add(avion);
    }

    public void mostrarAviones() {
        System.out.println("Aviones en la flota '" + nombreFlota + "':");
        for (Avion avion : aviones) {
            System.out.println("- Modelo: " + avion.getModelo() + ", Capacidad: " + avion.getCapacidad());
        }
    }

}
