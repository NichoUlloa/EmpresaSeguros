public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializar();
    }

    public void inicializar() {
        EmpresaDeSeguros empresa = new EmpresaDeSeguros("Seguros UFRO", "Francisco Salazar 01145");

        empresa.agregarCliente(new Cliente("Juan Perez", 20, "11.111.111-1", 12345678, "Chileno"));

        empresa.agregarCliente(new Cliente("Pedro Perez", 20, "11.111.111-1", 23456789, "Chileno"));
        empresa.agregarCliente(new Cliente("Nicolas Ulloa", 72, "22.222.222-2", 34567890, "Chileno"));
        Cliente cliente = new Cliente("Juan Barria", 68, "33.333.333-3", 45678912, "Chileno");
        empresa.agregarCliente(cliente);

        empresa.mostrarClientes();

        System.out.println("Buscar cliente por rut:");
        System.out.println(empresa.buscarCliente("33.333.333-3"));

        System.out.println("Clientes tercera edad:");
        empresa.buscarClientesTerceraEdad();

        System.out.println("Asegurar cliente:");
        empresa.asegurarCliente("33.333.333-3", new Seguro("Seguro de vida", 1000000, "01/01/2020", "01/01/2021"));

        System.out.println("Eliminar cliente:");
        empresa.eliminarCliente("11.111.111-1");

        Vendedor vendedor = new Vendedor("Juan Loyola", "44.444.444-4", 12345678, "Chileno");
        empresa.agregarVendedor(vendedor);
        empresa.agregarVendedor(new Vendedor("Pedro Loyola", "55.555.555-5", 23456789, "Chileno"));
        empresa.agregarVendedor(new Vendedor("Nicolas Loyola", "66.666.666-6", 34567890, "Chileno"));
        empresa.despedirVendedor("55.555.555-5");

        empresa.mostrarVendedores();

        System.out.println("Buscar vendedor por rut:");
        System.out.println(empresa.buscarVendedor("66.666.666-6"));
    }

}