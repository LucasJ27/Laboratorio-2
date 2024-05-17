package Ejercicio3;

public class EjecutableEjercicio3 {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        Producto alimento = new Producto("Manzana", 0.5);
        Producto electronico = new Producto("Televisor", 299.99);
        Producto ropa = new Producto("Camiseta", 19.99);

        almacen.agregarProducto(alimento);
        almacen.agregarProducto(electronico);
        almacen.agregarProducto(ropa);

        almacen.imprimirProductos();
    }
}
