public class Complejo {
    double real;
    double imaginaria;

    String aCadena() {
        if (imaginaria == 0) {
            return "" + real;
        } else if (imaginaria < 0) {
            return real + " - " + (-imaginaria) + "i";
        } else {
            return real + " + " + imaginaria + "i";
        }
    }
    double calcularModulo() {
        return Math.sqrt(
                real * real + imaginaria * imaginaria);

    }
}
