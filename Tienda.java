import java.util.ArrayList;
import java.util.HashSet;
public class Tienda {
    private ArrayList<Producto> productosVendidos;
    private HashSet<Producto> productosQueSeOfrecen;
    public Tienda(){
        this.productosVendidos= new ArrayList<>();
        this.productosQueSeOfrecen= new HashSet<>();
    }
    public void addProductosQueSeOfrecen(Producto a){
        this.productosQueSeOfrecen.add(a);
    }
    public void registrarVenta(Producto a){
        for(Producto b : this.productosQueSeOfrecen){
            if(b.getNombre().equals(a.getNombre())){
                this.productosVendidos.add(a);
                a.sumarVecesQueFueVendido();
                System.out.println("Se vendio el producto");
                break;
            }
        }
    }
    public void productosConMadDe5Ventas(){
        for(Producto a : this.productosVendidos){
            if(a.getVecesQueFueVendido()>5)
                System.out.println("\n"+a.getNombre());
        }
    }
    public void nombreDeLosProductosQueSeVendieron(){
        for(Producto a : this.productosVendidos){
            System.out.println("\n"+a.getNombre());
        }
    }
}