public class Cliente {
    private String nombreCliente;
    private int edadCliente;
    private String rutCliente;
    private int numeroTelefonico;
    private String nacionalidad;

    public Cliente(String nombreCliente, int edadCliente, String rut, int numeroTelefonico, String nacionalidad) {
        this.nombreCliente = nombreCliente;
        this.edadCliente = edadCliente;
        this.rutCliente = rut;
        this.numeroTelefonico = numeroTelefonico;
        this.nacionalidad = nacionalidad;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public int getEdadCliente() {
        return this.edadCliente;
    }

    public String getRut() {
        return this.rutCliente;
    }

    public int getNumeroTelefonico() {
        return this.numeroTelefonico;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }
    public void setRut(String rut) {
        this.rutCliente = rut;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Cliente:\n" +
                "Nombre cliente: " + nombreCliente + "\n" +
                "Edad cliente: " + edadCliente + "\n" +
                "Rut cliente: " + rutCliente + "\n" +
                "Numero telefonico: " + numeroTelefonico + "\n" +
                "Nacionalidad: " + nacionalidad + "\n";
    }
}