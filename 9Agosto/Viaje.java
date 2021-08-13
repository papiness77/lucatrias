public class Viaje {
    private int precio;
    private int hora;
    private String fecha;
    public Viaje(int precio,int hora,String fecha){
        this.precio=precio;
        this.hora=hora;
        this.fecha=fecha;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        String elementosConcatenados;
        elementosConcatenados="hora: " + hora + " | fecha: " + fecha+ " | precio: " + precio;
        return elementosConcatenados;
    }
}