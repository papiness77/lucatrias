import java.util.HashMap;
import java.util.HashSet;

public class Cine {
    private String nombre;
    private int direccion;
    private HashSet<Sala> hashSalas;
    public Cine(String nombre,int direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.hashSalas=new HashSet<>();
    }
    public void aniadirSala(Sala sala){
        this.hashSalas.add(sala);
    }
    public HashSet<Integer> visitantes(){
        HashSet<Integer> idDeLosVisitantes=new HashSet<>();
        for(Sala sala:this.hashSalas){
            idDeLosVisitantes.addAll(sala.visitantesQueHanConcurridoAlgunaVez());
        }
        return idDeLosVisitantes;
    }
    public int cantidadTotalDeVisitantes(){
        int cantidadDeVisitantes=0;
        for(Sala sala:this.hashSalas){
            cantidadDeVisitantes+=sala.cantidadDeVisitasQueEstuvieronAlgunaVez();
        }
        return cantidadDeVisitantes;
    }
    public HashMap<Integer,Integer> visitantesConCantidadDeVisitas(){
        HashMap<Integer,Integer> cantidadDeVisitasPorVisitante= new HashMap<>();
        for(Sala sala:this.hashSalas){
            cantidadDeVisitasPorVisitante.putAll(sala.visitantesConCantidadDeVisitas());
        }
        return cantidadDeVisitasPorVisitante;
    }
    public String informeActualCine(){
        String retorno="";
        for (Sala sala:this.hashSalas){
            retorno+=sala.informeActual();
        }
        return retorno;
    }

}
