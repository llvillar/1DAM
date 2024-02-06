package ejercicios.obra;

public interface Puntuable {
    static int asignarPuntuacion(int puntuacion) throws IllegalArgumentException{
        if (puntuacion < 0 || puntuacion > 5){
            throw new IllegalArgumentException("La puntuacion debe ser de 0 a 5");
        }
         return puntuacion;
    }
}
