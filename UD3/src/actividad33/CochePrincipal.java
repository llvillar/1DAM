package actividad33;

public class CochePrincipal {
    public static void main(String[] args) {

        Coche coche = new Coche();

        coche.setBastidor("asdasdasd");

        //.....

        Motor motor = new Motor();

        motor.setCilindrada("2000cc");
        motor.setCombustible("Gasolina");
        motor.setPotencia(250);

        coche.setMotor(motor);

        CajaCambios caja1 = new CajaCambios("manual","6","CTG");
        coche.setCajaCambios(caja1);

        /////



        Coche coche2 = new Coche();

        Motor motor2 = new Motor();

        coche2.setMotor(motor2);
        coche2.getMotor().setCilindrada("1000cc");





        System.out.println(coche.getMotor().getPotencia());

    }
}
