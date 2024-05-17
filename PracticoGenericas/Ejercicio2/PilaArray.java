package Ejercicio2;

import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] array;
    private int contador;

    @SuppressWarnings("unchecked")
    public PilaArray(int tamanio) {
        array = (E[]) new Object[tamanio];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean agregar(E elemento) {
        if (contador < array.length) {
            array[contador] = elemento;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return array[contador - 1];
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        contador--;
        E elemento = array[contador];
        array[contador] = null;
        return elemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaArray: [");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
