package Ejercicio1;

public class EjecutableEjercicio1 {
    public static void main(String[] args) {
        OperableInteger a = new OperableInteger(10);
        OperableInteger b = new OperableInteger(5);

        System.out.println("Suma: " + a.suma(b.getValue()));
        System.out.println("Resta: " + a.resta(b.getValue()));
        System.out.println("Producto: " + a.producto(b.getValue()));
        System.out.println("División: " + a.division(b.getValue()));
    }
}
