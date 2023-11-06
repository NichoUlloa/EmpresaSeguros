public class Persona {
    private String nombre;
    private int edad;
    private String rut;
    private int numeroTelefonico;
    private String nacionalidad;

    public Persona(String nombre, int edad, String rut, int numeroTelefonico, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.numeroTelefonico = numeroTelefonico;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getRut() {
        return this.rut;
    }
    public int getNumeroTelefonico() {
        return this.numeroTelefonico;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona:\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Rut: " + rut + "\n" +
                "Numero telefonico: " + numeroTelefonico + "\n" +
                "Nacionalidad: " + nacionalidad + "\n";
    }
}