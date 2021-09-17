import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleadoArrayList;
    Empresa(String nombre){
        this.nombre=nombre;
        this.empleadoArrayList=new ArrayList<>();
    }
    public void aniadirEmpleado(Empleado a){
        this.empleadoArrayList.add(a);
    }

    public void porceentajesEmpresa(String nombreMes){
        for(Empleado a : empleadoArrayList){
            a.comprobarAsistencia(nombreMes);
            System.out.println(a.calcularPorcentaje());
        }
    }
}