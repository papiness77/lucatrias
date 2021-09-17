import java.util.ArrayList;
import java.util.HashMap;
public class Empleado {
    private String nombre;
    private String apellido;
    private int telefono;
    private String fechaNacimiento;
    private ArrayList<String> asistencia;
    private HashMap<Fecha,Integer> listaAsistencia;
    private ArrayList<Fecha> fechaArrayList;
    int contador;
    int cantidadDeDiass=1;
    Empleado(String nombre, String apellido, int telefono, String fechaNacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.fechaNacimiento=fechaNacimiento;
        asistencia=new ArrayList<>();
        listaAsistencia=new HashMap<>();
        fechaArrayList= new ArrayList<>();
    }
    public void ingresaAsistencia(Fecha b,int hora){
        listaAsistencia.put(b,hora);
        fechaArrayList.add(b);
    }
    public void comprobarAsistencia(String nombreMes){
        for(Fecha b:fechaArrayList){
            if(nombreMes.equals(b.getNombreMes())){
                cantidadDeDiass=b.getCantidadDeDias();
                contador += 1;
            }
        }
    }
    public int calcularPorcentaje(){
        int procentaje=contador*100/cantidadDeDiass;
        contador=0;
        return procentaje;
    }

}
