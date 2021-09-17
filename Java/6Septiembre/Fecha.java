public class Fecha {
    private int numero;
    private String nombreMes;
    private int cantidadDeDias;
    Fecha(int numero, String nombreMes, int cantidadDeDias){
        this.numero=numero;
        this.nombreMes=nombreMes;
        this.cantidadDeDias=cantidadDeDias;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNombreMes() {
        return nombreMes;
    }
    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }
    public int getCantidadDeDias() {
        return cantidadDeDias;
    }
    public void setCantidadDeDias(int cantidadDeDias) {
        this.cantidadDeDias = cantidadDeDias;
    }
}