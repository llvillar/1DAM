package comparacion;

import java.util.Comparator;

public class ComparadorTelefonoPersona implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getTelefono().compareTo(o2.getTelefono());
    }
}
