public class Electrodomestico {
    private double precioBase = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        //this.color = color;
        comprobarColor(color);
        //this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        switch (letra){
            case 'A','B','C','D','E','F':
                this.consumoEnergetico = letra;
                break;
            default:
                this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color){
        if (color.toLowerCase().equals("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris")){
            this.color = color.toLowerCase();
        } else {
            this.color = "blanco";
        }
    }

    public double precioFinal(){

        double precio = 0;
        switch (this.consumoEnergetico){
            case 'A':
                precio = this.precioBase + 100;
                break;
            case 'B':
                precio = this.precioBase + 80;
                break;
            case 'C':
                precio = this.precioBase + 60;
                break;
            case 'D':
                precio = this.precioBase + 50;
                break;
            case 'E':
                precio = this.precioBase + 30;
                break;
            case 'F':
                precio = this.precioBase + 10;
                break;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "peso: " +this.peso + " ,Preciobase: " + this.precioBase + " ,color: " + this.color + " ,consumo: " + this.consumoEnergetico;
    }
}
