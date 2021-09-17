import java.util.ArrayList;
public class TarjetaEquis {
    private float saldo;
    private static float saldoNegativoMaximo;
    private int idTarjeta;
    private float ultimoMonto;
    private ArrayList<Viaje> viajeArrayList;
    public TarjetaEquis(float saldo,float saldoNegativo,int id){
        this.saldo=saldo;
        this.saldoNegativoMaximo=saldoNegativo;
        this.idTarjeta=id;
        this.viajeArrayList= new ArrayList<>();
    }
    public void cargarSube(float monto){
        this.saldo+=monto;
        this.ultimoMonto=monto;
    }
    public void realizarViaje(Viaje viaje){
        this.viajeArrayList.add(viaje);
    }
    public void ultimoMontoAbonado(){
        System.out.println("El ultimo monto abonado fue de"+ultimoMonto);
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldoNegativoMaximo() {
        return saldoNegativoMaximo;
    }
    public void setSaldoNegativoMaximo(float saldoNegativoMaximo) {
        this.saldoNegativoMaximo = saldoNegativoMaximo;
    }
    public int getIdTarjeta() {
        return idTarjeta;
    }
    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    public float getUltimoMonto(){
        return ultimoMonto;
    }
    public void setUltimoMonto(float ultimoMonto) {
        this.ultimoMonto = ultimoMonto;
    }
}