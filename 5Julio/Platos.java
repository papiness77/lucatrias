public class Platos {
    private String nombreplato;
    private int precio;
    public Platos(String nombre,int precio){
        this.nombreplato=nombre;
        this.precio=precio;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getNombreplato() {
        return nombreplato;
    }
    public void setNombreplato(String nombreplato) {
        this.nombreplato = nombreplato;
    }
}