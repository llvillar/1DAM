package figuras.exceptions;

public class NombreFiguraNoValidoException extends IllegalArgumentException{

    public NombreFiguraNoValidoException() {
        this("El nombre de la figura no es válido");
    }

    public NombreFiguraNoValidoException(String message) {
        super(message);
    }
}
