class Articulo {
    protected int idArticulo;
    private String tipo;
    private String nombre;
    private int stock;

    public Articulo(int idArticulo, String tipo, String nombre, int stock) {
        this.idArticulo = idArticulo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "idArticulo=" + idArticulo +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                '}';
    }
}
