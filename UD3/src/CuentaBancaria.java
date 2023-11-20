public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String titular,
                          String numeroCuenta,
                          double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
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