package directorioEmpresas;

import java.io.Serializable;

class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cif;
    private String razonSocial;
    private String telefono;
    private int anoConstitucion;
    private String nombreContacto;

    public Empresa(String cif, String razonSocial, String telefono, int anoConstitucion, String nombreContacto) {
        this.cif = cif;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.anoConstitucion = anoConstitucion;
        this.nombreContacto = nombreContacto;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAnoConstitucion() {
        return anoConstitucion;
    }

    public void setAnoConstitucion(int anoConstitucion) {
        this.anoConstitucion = anoConstitucion;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cif='" + cif + '\'' +
                "razonSocial='" + razonSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", anoConstitucion=" + anoConstitucion +
                ", nombreContacto='" + nombreContacto + '\'' +
                '}';
    }
}