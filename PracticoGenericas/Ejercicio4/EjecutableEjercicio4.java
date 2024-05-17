package Ejercicio4;

public class EjecutableEjercicio4 {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        Producto alimento = new Producto("Manzana", 0.5);
        Producto electronico = new Producto("Televisor", 299.99);
        Producto ropa = new Producto("Camiseta", 19.99);

        almacen.agregarElemento(alimento);
        almacen.agregarElemento(electronico);
        almacen.agregarElemento(ropa);

        almacen.imprimirElementos();
    }
}
