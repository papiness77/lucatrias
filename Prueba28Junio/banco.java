import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class banco{
    private String nombre;
    private ArrayList<cliente> arrayListClientes;

    public banco(String nombre) {
        this.nombre=nombre;
        this.arrayListClientes = new ArrayList<>();
    }

    public void agregarClientesVisitantes(cliente a){
        this.arrayListClientes.add(a);
    }
    public HashSet<Integer> cbusDeClientesVisitantes(){
        HashSet<Integer> hashSetCbu = new HashSet<>();
        for(cliente a:this.arrayListClientes){
            hashSetCbu.add(a.getCbu());
        }
        return hashSetCbu;
    }

    public void imprimirHashSet(HashSet<Integer> a){
        for(Integer c:a){
            System.out.println(c);
        }
    }
    public HashMap<Integer,Integer> cantidadDeVisitasPorCliente(int visitas,cliente a){
        HashMap<Integer,Integer> hashMapCantVisitas = new HashMap<>();
        hashMapCantVisitas.put(a.getCbu(),visitas);

        return  hashMapCantVisitas;
    }

    public void imprimirHashMap(HashMap<Integer,Integer> a){
        for(Integer c : a.keySet()){
            System.out.println("clave:"+a.keySet()+"- valor:"+a.get(c));
        }
    }

}
