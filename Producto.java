import java.util.ArrayList;
import java.util.HashMap;
public class Producto{
    private int codigo;
    private String nombre;
    private int stock;
    private float precio;
    private static int descuento=30;
    private int vecesQueFueVendido;

    public Producto(int codigo,String nombre,int stock,float precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.stock=stock;
        this.precio=precio;
    }
    public float precioDescuento(){
        float precioConDescuento=descuento*precio/100;
        return precioConDescuento;
    }
    public static void imprimirInformacion(Producto a){
        System.out.println("El codigo es: "+a.getCodigo()+"El nombre es: "+a.getNombre()+"El stock es: "+ a.getStock()+"El precio es: "+a.getPrecio());
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getVecesQueFueVendido() {
        return vecesQueFueVendido;
    }
    public void sumarVecesQueFueVendido() {
        this.vecesQueFueVendido = vecesQueFueVendido+1;
    }
}