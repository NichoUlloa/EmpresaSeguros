import java.util.List;
import java.util.ArrayList;

public class EmpresaDeSeguros {
    private String nombreEmpresa;
    private String direccionEmpresa;
    private List<Cliente> clientes;
    private List<Vendedor> vendedores;
    private List<Seguro> seguros;

    public EmpresaDeSeguros(String nombreEmpresa, String direccionEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.clientes = new ArrayList<Cliente>();
        this.vendedores = new ArrayList<Vendedor>();
        this.seguros = new ArrayList<Seguro>();
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return this.direccionEmpresa;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public List<Vendedor> getVendedores() {
        return this.vendedores;
    }

    public List<Seguro> getSeguros() {
        return this.seguros;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void setSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void agregarCliente(Cliente cliente) {
        Cliente clienteBuscado = this.buscarCliente(cliente.getRut());
        if (clienteBuscado == null) {
            this.clientes.add(cliente);
        }
        else {
            System.out.println("El rut del cliente ya existe");
        }
    }

    public void agregarVendedor(Vendedor vendedor) {
        Vendedor vendedorBuscado = this.buscarVendedor(vendedor.getRut());
        if (vendedorBuscado == null) {
            this.vendedores.add(vendedor);
        }
    }

    public Cliente buscarCliente(String rut) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getRut().equals(rut)) {
                return cliente;
            }
        }
        return null;
    }

    public Vendedor buscarVendedor(String rut) {
        for (Vendedor vendedor : this.vendedores) {
            if (vendedor.getRut().equals(rut)) {
                return vendedor;
            }
        }
        return null;
    }

    public void despedirVendedor(String rut) {
        Vendedor vendedor = this.buscarVendedor(rut);
        if (vendedor != null) {
            this.vendedores.remove(vendedor);
            System.out.println("Vendedor despedido");
            System.out.println(vendedor);
        }
        else {
            System.out.println("El vendedor no existe");
        }
    }

    public void asegurarCliente(String rut, Seguro seguro) {
        Cliente cliente = this.buscarCliente(rut);
        if (cliente != null) {
            this.seguros.add(seguro);
            System.out.println("Cliente asegurado");
            System.out.println(cliente);
        }
        else {
            System.out.println("El cliente no existe");
        }
    }

    public void buscarClientesTerceraEdad() {
        for (Cliente cliente : this.clientes) {
            if (cliente.getEdadCliente() > 60) {
                System.out.println(cliente);
            }
        }
    }

    public void mostrarClientes() {
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente);
        }
    }

    public void mostrarVendedores() {
        for (Vendedor vendedor : this.vendedores) {
            System.out.println(vendedor);
        }
    }

    public void eliminarCliente(String rut) {
        Cliente cliente = this.buscarCliente(rut);
        if (cliente != null) {
            this.clientes.remove(cliente);
            System.out.println("Cliente eliminado");
            System.out.println(cliente);
        }
        else {
            System.out.println("El cliente no existe");
        }
    }

}