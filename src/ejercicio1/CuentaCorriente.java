package ejercicio1;

public class CuentaCorriente {

    private int numeroCuenta;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.numeroCuenta = cc.getNumeroCuenta();
        this.saldo = cc.getSaldo();
    }

    public void ingreso() {}

    public void egreso() {}

    public void reintegro() {}

    public void trasnferencia() {}

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
