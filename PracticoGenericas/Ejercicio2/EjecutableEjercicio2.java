package Ejercicio2;

public class EjecutableEjercicio2 {
    public static void main(String[] args) {
        PilaArray<Integer> pila = new PilaArray<>(5);
        pila.agregar(1);
        pila.agregar(2);
        pila.agregar(3);
        System.out.println(pila);
        System.out.println(pila.primero());
        pila.extraer();
        System.out.println(pila);
        System.out.println(pila.estaVacia());
        pila.extraer();
        pila.extraer();
        System.out.println(pila.estaVacia());
    }
}
