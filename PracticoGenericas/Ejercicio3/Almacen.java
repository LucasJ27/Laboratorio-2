package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void imprimirProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}