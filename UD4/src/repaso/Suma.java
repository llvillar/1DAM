package repaso;

public class Suma {

    private int a;
    private  int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Suma() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int operacion(){
        return this.a + this.b;
    }

    @Override
    public String toString() {
        return "Suma{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
