import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sala {
    private int numero;
    private int cantAsientos;
    private HashSet<Visitante> personasQueHanIngresado;
    private HashSet<Visitante> personasQueEstan;
    private static int capacidad=50;
    public Sala(int numero,int cantAsientos){
        this.numero=numero;
        this.cantAsientos=cantAsientos;
        this.personasQueHanIngresado=new HashSet<>();
        this.personasQueEstan=new HashSet<>();
    }
    public void aniadirPersonasASala(Visitante visitante){
        this.personasQueEstan.add(visitante);
        this.personasQueHanIngresado.add(visitante);
        visitante.sumarCantDeVisitas();
    }
    public void salenPersonasDeLaSala(Visitante visitante){
        this.personasQueEstan.remove(visitante);
    }

    public HashMap<Integer,Integer> nroDeAsientosConCantidadDePreferencias(){
        int asiento=0;
        HashMap<Integer,Integer> hashPreferencias = new HashMap<>();
        for(Visitante visitante: this.personasQueHanIngresado){
            int contadorPrefercia=0;
            asiento=visitante.getNumeroDeAsiento();
            for(Visitante visitante2: this.personasQueHanIngresado){
                if(asiento== visitante2.getNumeroDeAsiento()){
                    contadorPrefercia++;
                }
                hashPreferencias.put(asiento,contadorPrefercia);
            }
        }
        return hashPreferencias;
    }

    public HashMap<Integer,Integer> visitantesConCantidadDeVisitas(){
        HashMap<Integer,Integer> hashMapARetornar= new HashMap<>();
        for(Visitante visitante:this.personasQueHanIngresado){
            hashMapARetornar.put(visitante.getId(),visitante.getCantDeVisitas());
        }
        return hashMapARetornar;
    }
    public int cantidadDeVisitasPresentes(){
        int contadorDeVisitantes=0;
        for(Visitante visitante:this.personasQueEstan){
            contadorDeVisitantes++;
        }
        return contadorDeVisitantes;
    }
    public int cantidadDeVisitasQueEstuvieronAlgunaVez(){
        int contadorDeVisitantes=0;
        for(Visitante visitante:this.personasQueHanIngresado){
            contadorDeVisitantes++;
        }
        return contadorDeVisitantes;
    }
    public boolean estaLlena(){
        boolean boolARetornar=false;
        int contadorDeVisitantes=0;
        for(Visitante visitante:this.personasQueEstan){
            contadorDeVisitantes++;
        }
        if(contadorDeVisitantes==50){
            boolARetornar=true;
        }
        return boolARetornar;
    }
    public boolean hayInfiltrados(){
        boolean boolARetornar=false;
        int contadorDeVisitantes=0;
        for(Visitante visitante:this.personasQueEstan){
            contadorDeVisitantes++;
        }
        if(contadorDeVisitantes>=50){
            boolARetornar=true;
        }
        return boolARetornar;
    }
    public int asientosDisponibles(){
        int contadorDeVisitantes=0;
        for(Visitante visitante:this.personasQueEstan){
            contadorDeVisitantes++;
        }
        int asientosDisponibles=capacidad-contadorDeVisitantes;
        return asientosDisponibles;
    }
    public HashSet<Integer> visitantesQueHanConcurridoAlgunaVez(){
        HashSet<Integer> idDeLosVisitantes=new HashSet<>();
        for(Visitante visitante:this.personasQueHanIngresado){
            idDeLosVisitantes.add(visitante.getId());
        }
        return  idDeLosVisitantes;
    }

    public String informeActual() {
        return " Numero de sala: " + this.numero +
                " Cantidad de asientos: " + this.cantAsientos +
                " Capacidad: " + capacidad +
                " Cantidad de personas presente:  " + this.cantidadDeVisitasPresentes() +
                " Cantidad de asientos disponibles: " + this.asientosDisponibles() ;
    }
}
