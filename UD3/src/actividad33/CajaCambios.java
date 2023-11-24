package actividad33;

public class CajaCambios {

    private String tipoCambio;
    private String numeroMarchos;

    private String convertor;

    public CajaCambios() {
    }

    public CajaCambios(String tipoCambio, String numeroMarchos, String convertor) {
        this.tipoCambio = tipoCambio;
        this.numeroMarchos = numeroMarchos;
        this.convertor = convertor;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getNumeroMarchos() {
        return numeroMarchos;
    }

    public void setNumeroMarchos(String numeroMarchos) {
        this.numeroMarchos = numeroMarchos;
    }

    public String getConvertor() {
        return convertor;
    }

    public void setConvertor(String convertor) {
        this.convertor = convertor;
    }
}
