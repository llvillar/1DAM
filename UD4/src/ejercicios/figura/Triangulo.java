package ejercicios.figura;

public abstract class Triangulo extends FiguraGeometrica {
    private final double base;
    private final double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void dibujar() {
        System.out.println("   .");
        System.out.println("  / \\");
        System.out.println(" /   \\");
        System.out.println("+-----+");
    }

    @Override
    public double getArea() {
        return base * altura / 2;
    }

    @Override
    final public String getTipoPrincipal() {
        return "Triángulo";
    }

    @Override
    public String toString() {
        return super.toString() + " - Triangulo de base " +
                base + " y altura " + altura;
    }
}
