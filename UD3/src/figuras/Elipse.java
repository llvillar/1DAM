package figuras;

public class Elipse {

    public double semiejeMayor = 1;
    public double semiejeMenor = 1;

    public Elipse() {
        this.semiejeMenor = 1;
    }

    public Elipse(double radio) throws Exception{
        this(radio, radio);
    }

    public Elipse(double semiejeMayor, double semiejeMenor) throws Exception{
        if (semiejeMenor <= 0 || semiejeMayor <= 0){
            throw new Exception("La elipse no puede tener semiejes negativos");
        }
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    public double calcularArea() {
        return Math.PI * semiejeMayor * semiejeMenor;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * Math.sqrt((semiejeMayor * semiejeMayor + semiejeMenor * semiejeMenor) / 2);
    }


}
