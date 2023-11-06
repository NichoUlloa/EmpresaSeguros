public class Vendedor extends Persona {
    private int antiguedadVendedorAnios;

    public Vendedor(int antiguedadVendedorAnios, String nombre, int edad, String rut, int numeroTelefonico, String nacionalidad) {
        super(nombre, edad, rut, numeroTelefonico, nacionalidad);
        this.antiguedadVendedorAnios = antiguedadVendedorAnios;
    }

    public int getAntiguedadVendedorAnios() {
        return this.antiguedadVendedorAnios;
    }

    public void setAntiguedadVendedorAnios(int antiguedadVendedorAnios) {
        this.antiguedadVendedorAnios = antiguedadVendedorAnios;
    }

    @Override
    public String toString() {
        return "Vendedor:\n" +
                "Nombre: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Rut: " + getRut() + "\n" +
                "Numero telefonico: " + getNumeroTelefonico() + "\n" +
                "Nacionalidad: " + getNacionalidad() + "\n" +
                "Antiguedad: " + antiguedadVendedorAnios + "\n";
    }
}
