import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class registro {
    private HashMap<Producto, Integer> HashStock;

    public registro() {
        this.HashStock = new HashMap<>();
    }

    public void agregarProducto(Producto a,int stock) {
        this.HashStock.put(a,stock);
    }
    public void eliminarProducto(Producto a){
        this.HashStock.remove(a);
    }
    public void valorMonetarioDeposito(){
        int valorFinal = 0;
        for(Producto a : this.HashStock.keySet()){
            int valorInicial= a.getPrecio()*this.HashStock.get(a);
            valorFinal= valorInicial+valorFinal;
        }
        System.out.println(valorFinal);
    }
    public void productosSinStock(){
        System.out.println("estos son los productos sin stock");
        for(Producto a : this.HashStock.keySet()){
            if(this.HashStock.get(a)==0){
                System.out.println(a.getNombre());
            }
        }
    }
    public void stockSegunNombre(String nombreProducto){
        System.out.println("estos son los productos segun nombre");
        for (Producto a : this.HashStock.keySet()){
            if(a.getNombre()==nombreProducto){
                System.out.println(this.HashStock.get(a));
            }
        }
    }
    public void productosCon15Unidades(){
        System.out.println("estos son los productos con 15 unidades o menos");
        for(Producto a : this.HashStock.keySet()){
            if(this.HashStock.get(a)<=15){
                System.out.println(a.getNombre());
            }
        }
    }
    }
