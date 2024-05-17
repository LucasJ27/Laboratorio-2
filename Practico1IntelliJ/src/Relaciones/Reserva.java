package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String fechaReserva;
    private int numReserva;
    private List<Vuelo> vuelos;
    public Reserva(){
    }
    public Reserva(String fechaReserva, int numReserva) {
        this.fechaReserva = fechaReserva;
        this.numReserva = numReserva;
        this.vuelos = new ArrayList<>();
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }
    public void mostrarVuelos() {
        System.out.println("Vuelos de la reserva:");
        for (Vuelo vuelo : vuelos) {
            System.out.println("Fecha de vuelo: " + vuelo.getFechaVuelo() + ", Horario de vuelo: " + vuelo.getHorarioVuelo() + ", Número de vuelo: " + vuelo.getNumeroVuelo());
        }
    }
}
