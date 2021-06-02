public class Hijo extends Persona {
    private String Escuela;
    private String JuegoFavorito;

    public Hijo(String nombre, int edad, int dni,String Escuela,String JuegoFavorito) {
        super(nombre, edad, dni);
        this.Escuela = Escuela;
        this.JuegoFavorito = JuegoFavorito;
    }
}
