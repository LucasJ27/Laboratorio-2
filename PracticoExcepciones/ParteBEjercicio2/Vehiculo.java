package ParteBEjercicio2;

public class Vehiculo {
    private int velocidad;
    private String nombre;

    public Vehiculo(int velocidad, String nombre) {
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    public void acelera() throws MiException {
        if (velocidad + 50 > 120) { // Suponiendo que se acelera en 10 km/h
            throw new MiException("El vehículo no puede acelerar más de 120km/h", nombre);
        }
        velocidad += 50;
    }
    public void frena(){}
}
