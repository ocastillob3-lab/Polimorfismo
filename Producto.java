package polimorfismo;

public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDescripcion() {
        System.out.println(nombre + " - Q" + precio);
    }
}