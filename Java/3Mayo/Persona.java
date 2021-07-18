import java.util.ArrayList;
import java.util.Scanner;
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    public Persona(String nuevonombre, int nuevaedad,int nuevodni ) {
        this.nombre = nuevonombre;
        this.edad =nuevaedad ;
        this.dni = nuevodni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
}