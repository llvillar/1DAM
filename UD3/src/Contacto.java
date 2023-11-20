public class Contacto {
    String nombre;
    String telefono;

    public String toString(){
        return nombre + " (" + telefono + ")";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this.nombre.equals(((Contacto) obj).nombre) && this.telefono.equals(((Contacto) obj).telefono))
//            return true;
//        return false;
//
//    }
}
