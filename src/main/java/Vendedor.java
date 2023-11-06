public class Vendedor {
    private String nombreVendedor;
    private String rutVendedor;
    private int numeroTelefonico;
    private String nacionalidad;

    public Vendedor(String nombreVendedor, String rut, int numeroTelefonico, String nacionalidad) {
        this.nombreVendedor = nombreVendedor;
        this.rutVendedor = rut;
        this.numeroTelefonico = numeroTelefonico;
        this.nacionalidad = nacionalidad;
    }

    public String getNombreVendedor() {
        return this.nombreVendedor;
    }

    public String getRut() {
        return this.rutVendedor;
    }

    public int getNumeroTelefonico() {
        return this.numeroTelefonico;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void setRut(String rut) {
        this.rutVendedor = rut;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Vendedor:\n" +
                "Nombre vendedor: " + nombreVendedor + "\n" +
                "Rut vendedor: " + rutVendedor + "\n" +
                "Numero telefonico: " + numeroTelefonico + "\n" +
                "Nacionalidad: " + nacionalidad + "\n";
    }
}
