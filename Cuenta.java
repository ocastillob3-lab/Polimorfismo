package polimorfismo;

public class Cuenta {
    double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Saldo: " + saldo);
    }
}