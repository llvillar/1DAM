public class PrincipalComplejo {
    public static void main(String[] args) {

        Complejo c1 = new Complejo();
        c1.real = 3;
        c1.imaginaria = 4;

        System.out.println(c1.aCadena() +
                " -> Módulo: " + c1.calcularModulo());

        Complejo c2 = new Complejo();
        c2.real = 6;
        c2.imaginaria = -8;

        System.out.println(c2.aCadena() +
                " -> Módulo: " + c2.calcularModulo());
    }
}
