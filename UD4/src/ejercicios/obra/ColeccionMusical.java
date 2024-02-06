package ejercicios.obra;

public class ColeccionMusical extends ColeccionAudioVisual{
    public ColeccionMusical(String descripcion) {
        super(descripcion);
    }

    @Override
    public void addObra(ObraAudiovisual obraAudiovisual) throws ObraDuplicadaException {
        if(obraAudiovisual instanceof Disco){
            super.addObra(obraAudiovisual);
        }
    }
}
