package ejercicios.obra;

import java.util.ArrayList;
import java.util.List;

public class ColeccionAudioVisual implements TieneValoracion{
    private String descripcion;

    private List<ObraAudiovisual> obras;

    public ColeccionAudioVisual(String descripcion) {
        setDescripcion(descripcion);
        this.obras = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if(descripcion == null || descripcion.isBlank()){
            throw new IllegalArgumentException("La coleccion debe de tener una descripcion");
        }
        this.descripcion = descripcion;
    }

    public void addObra(ObraAudiovisual obraAudiovisual) throws ObraDuplicadaException {
        if(obras.contains(obraAudiovisual)){
            throw new ObraDuplicadaException("La obra ya existe");
        }

        obras.add(obraAudiovisual);
    }

    public void delteObra(ObraAudiovisual obraAudiovisual){
        obras.remove(obraAudiovisual);
    }

    public List<ObraAudiovisual> getObras() {
        return List.copyOf(obras);
    }

    @Override
    public double obtenerValoracion() {
        double valoracion = 0;
        for(ObraAudiovisual obra : obras){
            valoracion += obra.obtenerValoracion();
        }

        return valoracion / obras.size();
    }

    public ObraAudiovisual mejorValorada(){
        ObraAudiovisual aux = null;
        for(ObraAudiovisual o : obras){
            if(aux == null){
                aux = o;
            } else{
                if(aux.obtenerValoracion() < o.obtenerValoracion()){
                    aux = o;
                }
            }
        }

        return aux;
    }

    public ObraAudiovisual peorValorada(){
        ObraAudiovisual aux = null;
        for(ObraAudiovisual o : obras){
            if(aux == null){
                aux = o;
            } else{
                if(aux.obtenerValoracion() > o.obtenerValoracion()){
                    aux = o;
                }
            }
        }
        return aux;
    }

    public List<ObraAudiovisual> obrasDuracionMaxima(int duracion){

        List<ObraAudiovisual> aux = new ArrayList<>();
        for(ObraAudiovisual o : obras){
            if(o.getDuracion() <= duracion){
                aux.add(o);
            }

        }
        return aux;
    }
}
