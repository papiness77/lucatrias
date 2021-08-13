import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class SistemaRegistro{
    private HashSet<Pasajero> pasajeroHashSet;
    private HashSet<Pasajero> historialPasajerosHashSet;
    public SistemaRegistro(){
        this.pasajeroHashSet = new HashSet<>();
        this.historialPasajerosHashSet = new HashSet<>();
    }
    public void subePasajero(Pasajero pasajero,Viaje viaje){
        if(pasajero.getTarjeta().getSaldo()>=viaje.getPrecio()){
            this.pasajeroHashSet.add(pasajero);
            this.historialPasajerosHashSet.add(pasajero);
            pasajero.getTarjeta().setUltimoMonto(viaje.getPrecio());
            pasajero.getTarjeta().setSaldo(pasajero.getTarjeta().getSaldo()-viaje.getPrecio());
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void seBajaPasajero(Pasajero pasajero){
        this.pasajeroHashSet.remove(pasajero);
    }
    public HashSet<Pasajero> pasajerosQueSeHanSubidoAlgunaVez(){
        return this.historialPasajerosHashSet;
    }
    public HashMap<Pasajero,Float> pasajeroConUltimoMontoAbonado(){
        HashMap<Pasajero, Float> pasajeroHashMap = new HashMap<>();
        for(Pasajero a : this.historialPasajerosHashSet){
            pasajeroHashMap.put(a,a.getTarjeta().getUltimoMonto());
        }
        return pasajeroHashMap;
    }
    public void ultimoMontoAbondaoPorPasajero(float id){
        for(Pasajero a : this.historialPasajerosHashSet){
            if(a.getTarjeta().getIdTarjeta()==id){
                System.out.println(a.getTarjeta().getUltimoMonto());
            }
        }
    }
    public boolean seSuperaElSaldoNegativo(Pasajero pasajero){
        if(pasajero.getTarjeta().getSaldo()<pasajero.getTarjeta().getSaldoNegativoMaximo()) return true;
        else{ return false;
        }
    }
}