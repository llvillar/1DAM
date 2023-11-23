package enumeraciones;

public class ElectrodomesticoEnum {
    private double precioBase = 100;
    private ColoresElectrodomesticos color = ColoresElectrodomesticos.blanco;
    private EficienciaEnergenica consumoEnergetico = EficienciaEnergenica.F;
    private double peso = 5;

    public ElectrodomesticoEnum() {
    }

    public ElectrodomesticoEnum(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public ElectrodomesticoEnum(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        //this.color = color;
        comprobarColor(color);
        //this.consumoEnergetico = consumoEnergetico;
        try {
            comprobarConsumoEnergetico(consumoEnergetico);
        }catch (Exception e){
            this.consumoEnergetico = EficienciaEnergenica.F;
        }
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public ColoresElectrodomesticos getColor() {
        return color;
    }

    public EficienciaEnergenica getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra){

        EficienciaEnergenica ef = EficienciaEnergenica.F;
        try {
            ef = EficienciaEnergenica.valueOf(String.valueOf(letra));
        }catch (IllegalArgumentException e){
            ef = EficienciaEnergenica.F;
        }

        /*
        switch (EficienciaEnergenica.valueOf(String.valueOf(letra))){
            case A,B,C,D,E,F:
                this.consumoEnergetico = EficienciaEnergenica.valueOf(String.valueOf(letra));
                break;
            default:
                this.consumoEnergetico = EficienciaEnergenica.F;
        }
        */



    }

    private void comprobarColor(String color){

        /*
        ColoresElectrodomesticos c = ColoresElectrodomesticos.valueOf(color);
        if (c != null){
            this.color = ColoresElectrodomesticos.valueOf(color);
        } else {
            this.color = ColoresElectrodomesticos.blanco;
        }
         */

        try {

            switch (ColoresElectrodomesticos.valueOf(String.valueOf(color))) {
                case blanco:
                case negro:
                case gris:
                case azul:
                case rojo:
                    this.color = ColoresElectrodomesticos.valueOf(color);
                    break;
                default:
                    this.color = ColoresElectrodomesticos.blanco;
            }

        }catch (Exception e){
            this.color = ColoresElectrodomesticos.blanco;
        }
    }

    public double precioFinal(){

        double precio = 0;
        switch (this.consumoEnergetico){
            case A:
                precio = this.precioBase + 100;
                break;
            case B:
                precio = this.precioBase + 80;
                break;
            case C:
                precio = this.precioBase + 60;
                break;
            case D:
                precio = this.precioBase + 50;
                break;
            case E:
                precio = this.precioBase + 30;
                break;
            case F:
                precio = this.precioBase + 10;
                break;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "peso: " +this.peso + " ,Preciobase: " + this.precioBase + " ,color: " + this.color.name() + " ,consumo: " + this.consumoEnergetico.name();
    }
}
