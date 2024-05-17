package ParteBEjercicio3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            // Generar un número aleatorio
            int numero = generarNumeroAleatorio();

            // Verificar si el número es par o impar
            if (esPar(numero)) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        } catch (NumeroInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Método para generar un número aleatorio
    public static int generarNumeroAleatorio() throws NumeroInvalidoException {
        Random rand = new Random();
        int numero = rand.nextInt(11) - 5; // Genera un número aleatorio entre 0 y 100

        // Verificar si el número es negativo
        if (numero < 0) {
            throw new NumeroInvalidoException("El número generado es negativo.");
        }

        return numero;
    }

    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
