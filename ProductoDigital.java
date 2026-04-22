package polimorfismo;

public class ProductoDigital extends Producto {

    public ProductoDigital(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println(nombre + " - Q" + precio + " (Descarga digital)");
    }
}