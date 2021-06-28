public class Producto{
    private String nombre;
    private int precio;

    public Producto(String nombre,int precio){
        this.nombre= nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setProducto(String nombre,int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}