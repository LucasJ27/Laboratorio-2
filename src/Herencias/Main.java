package Herencias;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto(29,"Masculino","Lucas",50,"38756");
        System.out.println("Mi nombre es " + piloto1.nombre + ", tengo " + piloto1.edad + " años");
        System.out.println("Mi numero de licencia es: " + piloto1.getNumLicencia());
        piloto1.volar();
        piloto1.horasVuelo();
    }
}
