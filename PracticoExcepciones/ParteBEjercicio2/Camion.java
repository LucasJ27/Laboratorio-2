package ParteBEjercicio2;

public class Camion extends Vehiculo {
    public Camion(int velocidad) {
        super(velocidad, "Camion");
    }
    @Override
    public void acelera() {
        try {
            super.acelera();
            System.out.println("El Camion ha acelerado.");
        } catch (MiException e) {
            System.out.println("Error: " + e.getMessage() + " - Objeto: " + e.getNombreObjeto() );
        }
    }

    @Override
    public void frena(){
        System.out.println("El camion frena");
    }

    public void b1(){}
}
