package polimorfismo;

/*
=====================================================
EXPLICACIÓN
=====================================================
Se utilizó herencia (extends), sobrescritura (@Override)
y polimorfismo usando referencias del tipo base.

El método que se ejecuta depende del objeto real.
=====================================================
*/

public class Main {

    public static void main(String[] args) {

        Animal a = new Perro();
        a.hacerSonido();

        Figura f = new Rectangulo(5, 4);
        f.area();

        Empleado e = new Vendedor("Oscar", 200);
        e.resumen();

        Cuenta c = new CuentaAhorro(1000);
        c.depositar(500);

        Transporte t = new Avion();
        t.moverse();

        Persona p = new Estudiante("Oscar", "2025", "Ingeniería");
        p.presentarse();

        Vehiculo v = new Motocicleta();
        v.encender();

        Producto pr = new ProductoDigital("Curso Java", 100);
        pr.mostrarDescripcion();

        Instrumento i = new Guitarra();
        i.tocar();

        Trabajador tr = new TrabajadorPorHora(8, 50);
        System.out.println("Pago: " + tr.calcularPago());
    }
}