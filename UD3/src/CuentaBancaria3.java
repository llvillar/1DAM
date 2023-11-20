public class CuentaBancaria3 {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    private boolean activa = false;

    private final int SALDO_NEGATIVO = -1;
    private final int SALDO_POSITIVO = 1;
    private final int SALDO_CERO = 0;

    public CuentaBancaria3(String titular,
                           String numeroCuenta,
                           double saldoInicial) throws Exception{

        if (titular.length() == 0){
            throw  new Exception("El titular no puede estar vacío");
        }

        if(numeroCuenta.length() == 0){
            throw  new Exception("El número de cuenta no pude estar vacío");
        }

        if(saldoInicial < 0){
            throw  new Exception("El saldo inicial no puede ser negativo");
        }

        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) throws Exception{

        if (titular.length() == 0){
            throw  new Exception("El titular no puede estar vacío");
        }

        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    void ingresarDinero(double cantidad) throws Exception{
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw  new Exception("No se puede ingresar una cantidad negativa");
        }
    }

    void retirarDinero(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception(
                    "No se puede retirar más dinero que" +
                            " el saldo disponible"
            );
        }
        saldo -= cantidad;
    }

    public String toString() {
        return "Cuenta " + numeroCuenta +
                " de " + titular + " con " +
                saldo + " euros. La cuenta está activa/inactiva " + activa;
    }


    public int estadoCuenta(){
        if(saldo < 0)
            return SALDO_NEGATIVO;
        else if (saldo == 0)
            return SALDO_CERO;
        else
            return SALDO_POSITIVO;

    }

}