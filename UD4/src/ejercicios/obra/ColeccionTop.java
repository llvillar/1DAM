package ejercicios.obra;

public class ColeccionTop extends ColeccionAudioVisual{


    public ColeccionTop(String descripcion) {
        super(descripcion);
    }

    @Override
    public void addObra(ObraAudiovisual obraAudiovisual) throws ObraDuplicadaException {
        if(obraAudiovisual.obtenerValoracion() >= 4){
            super.addObra(obraAudiovisual);
        }
    }
}
