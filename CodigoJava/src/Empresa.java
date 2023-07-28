import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Empresa {
    private List<Articulo> articulos;
    private List<Cliente> clientes;
    private List<Venta> ventas;

    public List<Articulo> getListArticulos() {

        return this.articulos;

    }

    public Empresa() {
        this.articulos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public boolean agregarArticulo(String tipo, String nombre, int stock) {
        int idNuevo = 0;
        Articulo articulo = new Articulo(idNuevo, tipo, nombre, stock);

        if (articulos.size() == 0) {
            articulo.setIdArticulo(1);
            articulos.add(articulo);

        } else {

            idNuevo = articulos.get(articulos.size() - 1).getIdArticulo() + 1;
            articulo.setIdArticulo(idNuevo);
            articulos.add(articulo);
        }

        return true;
    }

    public boolean agregarCliente(String nombre, String apellido, int dni) {
        int idNuevo = 0;
        Cliente cliente = new Cliente(idNuevo, nombre, apellido, dni);

        if (clientes.size() == 0) {
            cliente.setIdCliente(1);
            clientes.add(cliente);

        } else {

            idNuevo = clientes.get(clientes.size() - 1).getIdCliente() + 1;
            cliente.setIdCliente(idNuevo);
            clientes.add(cliente);
        }

        return true;
    }

    public Cliente traerCliente(int idCliente) {
        boolean encontre = false;
        ListIterator<Cliente> cliente = clientes.listIterator();
        Cliente clienteEncontrado = null;
        while (cliente.hasNext() && !encontre)
            if (cliente.next().getIdCliente() == idCliente) {
                encontre = true;
                clienteEncontrado = cliente.previous();

            }
        return clienteEncontrado;
    }

    public Articulo traeArticulo(String nombre) {
        boolean encontre = false;
        ListIterator<Articulo> articulo = articulos.listIterator();
        Articulo articulo2 = null;
        while (articulo.hasNext() && !encontre)
            if (articulo.next().getNombre() == nombre) {
                encontre = true;
                articulo2 = articulo.previous();

            }
        return articulo2;
    }

    public boolean agregarVenta(Cliente cliente, Articulo articulo, int cantidad, LocalDate fecha) {
        int idNuevo = 0;
        Venta venta = new Venta(idNuevo, cliente, articulo, cantidad, fecha);

        if (ventas.size() == 0) {
            venta.setIdVenta(1);
            ventas.add(venta);

        } else {

            idNuevo = ventas.get(ventas.size() - 1).getIdVenta() + 1;
            venta.setIdVenta(idNuevo);
            ventas.add(venta);
        }

        return true;
    }

    public void mostrarArticulosVendidos() {
        System.out.println("Listado de artículos vendidos:");
        Set<String> articulosMostrados = new HashSet<>();

        for (Venta venta : ventas) {
            Articulo articulo = venta.getArticulo();
            String nombreArticulo = articulo.getNombre();

            // Verificar si el artículo ya fue mostrado
            if (!articulosMostrados.contains(nombreArticulo)) {
                int cantidadTotal = 0;
                // Sumar la cantidad de veces que se vendió el mismo artículo
                for (Venta ventaRepetida : ventas) {
                    if (ventaRepetida.getArticulo().getNombre().equals(nombreArticulo)) {
                        cantidadTotal += ventaRepetida.getCantidad();
                    }
                }

                System.out.println(
                        "\n *Artículo: " + nombreArticulo + " - Tipo: " + articulo.getTipo() + " - Cantidad vendida: "
                                + cantidadTotal);

                // Agregar el nombre del artículo al conjunto de artículos mostrados
                articulosMostrados.add(nombreArticulo);
            }
        }
    }

    public void mostrarVentasAntesDeFecha(LocalDate fecha) {
        System.out.println("Ventas realizadas antes de la fecha " + fecha + ":");
        for (Venta venta : ventas) {
            LocalDate fechaVenta = venta.getFecha();
            if (fechaVenta.isBefore(fecha)) {
                Cliente cliente = venta.getCliente();
                Articulo articulo = venta.getArticulo();
                int cantidad = venta.getCantidad();
                System.out.println("\n *Cliente: " + cliente.getNombre() + " " + cliente.getApellido() +
                        "\n Artículo: " + articulo.getNombre() + " - Cantidad: " + cantidad);
            }
        }
    }

    public void listarComprasPorCliente(Cliente cliente) {
        System.out.println(
                "Listado de compras para el cliente " + cliente.getNombre() + " " + cliente.getApellido() + ":");

        for (Venta venta : ventas) {
            if (venta.getCliente().equals(cliente)) {
                Articulo articulo = venta.getArticulo();
                LocalDate fecha = venta.getFecha();
                System.out.println(
                        "\n*  Fecha: " + fecha + " \n Artículo: " + articulo.getNombre() + " - Tipo: "
                                + articulo.getTipo());
            }
        }
    }

    public void listarPorTipo(List<Articulo> ListArticulos, String tipo) {
        System.out.println("-------Listado de artículos de tipo: " + tipo + "-------");
        for (Articulo articulo : ListArticulos) {
            if (articulo.getTipo().equals(tipo)) {
                int stock = articulo.getStock();
                System.out.println(
                        "\n *Artículo:\n " + articulo.getNombre() + " - Cantidad:" + stock);
                stock = 0;
            }

        }
        System.out.println("\n");
    }

}
