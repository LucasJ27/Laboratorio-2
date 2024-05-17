package ParteBEjercicio2;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(100);
        Camion camion = new Camion(110);
        try {
            Matricula matricula = new Matricula(938,true);
            Chofer chofer = new Chofer(matricula,"Lucas",matricula.getFechaVto());
            System.out.println("Chofer creado correctamente.");
        } catch (MatriculaVencidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Intentando acelerar el auto:");
        auto.acelera();
        System.out.println("\nIntentando acelerar el camión:");
        camion.acelera();


    }
}
