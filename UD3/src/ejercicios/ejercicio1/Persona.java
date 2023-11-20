package ejercicios.ejercicio1;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void generarDNI(){
        if(this.getDNI() != null && this.getDNI().length() > 0){
            Random random = new Random();
            int numero = random.nextInt(90000000) + 10000000;
            char letra = getLetra(numero);
            this.DNI = String.valueOf(numero) + letra;
            //this.DNI = String.valueOf(numero) + letra;
            this.setDNI(String.valueOf(numero) + letra);
        }


        String a;
        String b = new String();
        
        String c ="asdasdasd";
    }

    private char getLetra(int numero) {
        int indice = numero % 23;
        char letra = letras.charAt(indice);
        return letra;
    }

    public int calcularIMC(){

        double imc = this.getPeso() / (this.getAltura() * this.getAltura());
        if(imc < 20){
            return -1;
        } else if (imc >=20 && imc <= 25){
            return 0;
        }
        return 1;
    }

    public boolean comprobarSexo(char sexo){
        if(this.getSexo() != 'H' && this.getSexo() != 'M'){
            this.setSexo('H');
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + ", DNI:" + DNI + ", Sexo:" + sexo + ", Edad:" + edad + ", Peso:" + peso+ ", Altura:"+ altura;
    }
}
