package ejercicios.figura;

public abstract class Cuadrilatero extends FiguraGeometrica {
    double[] lados;

    public Cuadrilatero(String nombre, double l1, double l2, double l3, double l4) {
        super(nombre);
        lados = new double[4];
        lados[0] = l1;
        lados[1] = l2;
        lados[2] = l3;
        lados[3] = l4;
    }

    @Override
    public double getPerimetro() {
        double suma = 0;
        for (double lado : lados) {
            suma += lado;
        }
        return suma;
    }

    @Override
    final public String getTipoPrincipal() {
        return "Cuadrilátero";
    }

    @Override
    public String toString() {
        String resultado = super.toString() +
                " - Cuadrilatero de lados ";
        for (int i = 0; i < 4; i++) {
            if (i != 0) resultado += ", ";
            resultado += lados[i];
        }

        return resultado;
    }
}
