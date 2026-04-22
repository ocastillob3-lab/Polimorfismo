package polimorfismo;

public class TrabajadorPorHora extends Trabajador {

    int horas;
    double pagoHora;

    public TrabajadorPorHora(int horas, double pagoHora) {
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    @Override
    public double calcularPago() {
        return horas * pagoHora;
    }
}