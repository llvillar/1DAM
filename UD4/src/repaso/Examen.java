package repaso;

public class Examen {
    private  final String titulo;
    private double calificacion;
    static private String asignatura = "";

    public Examen(String titulo, double calificacion) throws Exception{
        if (titulo.isBlank()){
            throw new Exception("El titulo no puede estar en blanco");
        }
        setCalificacion(calificacion);
        this.titulo = titulo;
    }

    public Examen(Examen e){
        this.titulo = e.titulo;
        this.calificacion = e.calificacion;
    }

    public Examen(String titulo, Examen e){
        this.titulo = titulo;
        this.calificacion = e.calificacion;

    }

    public String getTitulo() {
        return titulo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) throws Exception{
        if(calificacion < 0 || calificacion >10){
            throw new Exception("Calificación no válida");
        }
        this.calificacion = calificacion;
    }

    public void redondear(){
        calificacion = Math.round(calificacion);
    }

    public boolean estaAprobado(){
        return calificacion >= 5;
    }

    public static String getAsignatura() {
        return asignatura;
    }

    public static void setAsignatura(String asignatura) {
        Examen.asignatura = asignatura;
    }

    @Override
    public String toString() {
        if(asignatura.isBlank()){
            return titulo + " - " + calificacion;
        } else {
            return asignatura + " - " + titulo + " - " + calificacion;

        }
    }
}
