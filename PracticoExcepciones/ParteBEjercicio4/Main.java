package ParteBEjercicio4;

public class Main {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Excepción atrapada en el método main: " + e.getMessage());
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        metodo4();
    }

    public static void metodo4() throws Exception {
        // Aquí lanzamos una excepción
        throw new Exception("¡Excepción lanzada desde el método 4!");
    }
}
