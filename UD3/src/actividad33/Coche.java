package actividad33;

public class Coche {

    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private String matricula;

    private Motor motor;

    private CajaCambios cajaCambios;
    private Rueda[] ruedas;

    private String[] identicadores;

    public Coche() {
    }

    public Coche(String bastidor, String marca, String modelo, String color, String matricula) {
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public CajaCambios getCajaCambios() {
        return cajaCambios;
    }

    public void setCajaCambios(CajaCambios cajaCambios) {
        this.cajaCambios = cajaCambios;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
}
