package figuras;

public class Rectangulo {
    public double base;
    public double altura;

    public Rectangulo() throws Exception{
        this(3);
    }

    public Rectangulo(double lado) throws Exception{
        this(lado, lado);
    }

    public Rectangulo(double base, double altura) throws Exception{
        if(base <= 0 || altura <=0){
            throw new Exception("Dimensiones no válidas");
        }
        this.base = base;
        this.altura = altura;
    }


    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}
