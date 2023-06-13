import java.util.ArrayList;
import java.util.List;

class Cliente {
    protected int idCliente;
    private String nombre;
    private String apellido;
    private int dni;
    private List<Venta> compras;

    public Cliente(int idCliente, String nombre, String apellido, int dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.compras = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Venta> getCompras() {
        return compras;
    }

    public void agregarCompra(Venta venta) {
        compras.add(venta);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", compras=" + compras +
                '}';
    }
}
