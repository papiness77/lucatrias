import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SistemaRegistro a = new SistemaRegistro();
        Persona as = new Persona("fernando", 20, 151999);
        Persona bs = new Persona("claudia", 82, 157777);
        Persona cs = new Persona("dababy", 10, 1);
        int eleccion = 0;
        int apas = 3;
        a.RegistrPersona(as);
        a.RegistrPersona(bs);
        a.RegistrPersona(cs);
        System.out.println("Bienvenido al sistema");
        while (apas == 3) {
            if (eleccion == 0) {
                System.out.println("Que quiere hacer: 1- Alta persona,2-Baja Persona,3-Modificar Persona,4-Personas +18,5- Mostrar todas las personas,6-Salir del sistema");
                Scanner apa = new Scanner(System.in);
                eleccion = apa.nextInt();
            } else if (eleccion == 1) {
                a.AgregagarPersona();
                eleccion = 0;
            } else if (eleccion == 2) {
                a.EliminarPersona();
                eleccion = 0;
            } else if (eleccion == 3) {
                a.ModificarDatosPersona();
                eleccion = 0;
            } else if (eleccion == 4) {
                a.PersonasMayores18();
                eleccion = 0;
            } else if (eleccion == 5) {
                a.ImprimirTodaslasPersonas();
                eleccion = 0;
            }
            else if (eleccion == 6) {
                apas=7;
            }
        }
    }
}
