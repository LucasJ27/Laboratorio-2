package Relaciones;

import Relaciones.Flota;
import Relaciones.Reserva;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota("Flota Comercial");
        Avion avion1 = new Avion(200, "Boeing 737");
        Avion avion2 = new Avion(300, "Airbus A320");

        Reserva reserva = new Reserva("17/03/2024",10);
        Vuelo vuelo1 = new Vuelo("18/03/2024", "20:00hs","5");
        Vuelo vuelo2 = new Vuelo("19/03/2024", "20:00hs","6");

        // Asociación entre Vuelo y Avión
        vuelo1.setAvion(avion1);
        System.out.println("El vuelo número " + vuelo1.getNumeroVuelo() + " tiene asignado el avión modelo " + vuelo1.getAvion().getModelo() + " con capacidad para " + vuelo1.getAvion().getCapacidad() + " pasajeros.");

        // Composicion entre Avion y Flota
        flota.agregarAvion(avion1);
        flota.agregarAvion(avion2);
        flota.mostrarAviones();

        // Agregacion entre Reserva y Vuelo
        reserva.agregarVuelo(vuelo1);
        reserva.agregarVuelo(vuelo2);
        reserva.mostrarVuelos();
    }
}
