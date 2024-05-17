package ParteBEjercicio2;

public class Auto extends Vehiculo{
    public Auto(int velocidad) {
        super(velocidad, "Auto");
    }

    @Override
    public void acelera() {
        try {
            super.acelera();
            System.out.println("El Auto ha acelerado.");
        } catch (MiException e) {
            System.out.println("Error: " + e.getMessage() + " - Objeto: " + e.getNombreObjeto() );
        }
    }

    @Override
    public void frena(){
        System.out.println("El auto frena");
    }


}
