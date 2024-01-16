package figuras.exceptions;

public class LadoNoValidoException extends IllegalArgumentException{

    public LadoNoValidoException() {
        this("Lado de la figura no válido");
    }

    public LadoNoValidoException(String s) {
        super(s);
    }
}
