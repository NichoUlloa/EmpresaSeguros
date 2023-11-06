public class Seguro {
    private String tipoSeguro;
    private double valorSeguro;
    private String fechaInicio;
    private String fechaTermino;

    public Seguro(String tipoSeguro, double valorSeguro, String fechaInicio, String fechaTermino) {
        this.tipoSeguro = tipoSeguro;
        this.valorSeguro = valorSeguro;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public String getTipoSeguro() {
        return this.tipoSeguro;
    }

    public double getValorSeguro() {
        return this.valorSeguro;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public String getFechaTermino() {
        return this.fechaTermino;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
}
