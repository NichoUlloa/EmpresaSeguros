public class Cliente extends Persona {
    private String direccionCliente;

    public Cliente(String direccionCliente,String nombre, int edad, String rut, int numeroTelefonico, String nacionalidad) {
        super(nombre, edad, rut, numeroTelefonico, nacionalidad);
        this.direccionCliente = direccionCliente;
    }

    public String getDireccionCliente() {
        return this.direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    @Override
    public String toString() {
        return "Cliente:\n" +
                "Nombre: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Rut: " + getRut() + "\n" +
                "Numero telefonico: " + getNumeroTelefonico() + "\n" +
                "Nacionalidad: " + getNacionalidad() + "\n" +
                "Direccion: " + direccionCliente + "\n";
    }
}