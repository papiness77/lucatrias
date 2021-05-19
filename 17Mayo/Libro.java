public class Libro {
    private float precio;
    private String nombre;
    private String nombreEditorial;
    public Libro(float nuevoprecio,String nuevonombre,String nuevonombreEditorial){
        this.precio = nuevoprecio;
        this.nombre = nuevonombre;
        this.nombreEditorial = nuevonombreEditorial;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreEditorial() {
        return nombreEditorial;
    }
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }
}