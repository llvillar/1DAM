package ejercicios.figura;

public class Trapecio extends Cuadrilatero {
    private final double baseMayor;
    private final double baseMenor;
    private final double altura;

    public Trapecio(String nombre, double baseMayor, double baseMenor, double altura) {
        super(nombre,
                Math.sqrt(altura * altura + 1/4.0 * Math.pow(baseMayor - baseMenor, 2)),
                baseMayor,
                Math.sqrt(altura * altura + 3/4.0 * Math.pow(baseMayor - baseMenor, 2)),
                baseMenor);

        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("   +--------+");
        System.out.println("  /         |");
        System.out.println(" /          |");
        System.out.println("+-----------+");
    }

    @Override
    public double getArea() {
        return (baseMayor + baseMenor) / 2 * altura;
    }
}
