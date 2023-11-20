public class CuentaBancaria2 {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria2(String titular,
                           String numeroCuenta,
                           double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial < 0 ? 0 : saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    double ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return cantidad;
        }
        return 0;
    }

    double retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            cantidad = saldo;
        }
        saldo -= cantidad;
        return cantidad;
    }

    public String toString() {
        return "Cuenta " + numeroCuenta +
                " de " + titular + " con " +
                saldo + " euros";
    }
}