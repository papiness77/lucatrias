public class Artista extends Persona{
    private  int contadorCanciones = 0;
    public Artista(String nombre, String apellido, String fechaDeNacimiento){
        super(nombre,apellido,fechaDeNacimiento);
    }
    public int getContadorCanciones() {
        return contadorCanciones;
    }
    public void setContadorCanciones(int contadorCanciones) {
        this.contadorCanciones += contadorCanciones;
    }
}
