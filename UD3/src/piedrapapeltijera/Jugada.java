package piedrapapeltijera;

public enum Jugada {
    PIEDRA, PAPEL, TIJERA

    boolean ganaA(Jugada otra){
        switch (this){
            case PIEDRA:
                if(otra == TIJERA) return true;
                break;
            case PAPEL:
                if(otra == PIEDRA) return true;
                break;
            case TIJERA:
                if (otra == PAPEL) return true;
                break;
            default:
        }
        return false;
    }

}
