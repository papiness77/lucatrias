
public class main {
    public static void main(String[] args){
        registro registroa = new registro();
        Producto a = new Producto("Manzana",10);
        Producto b = new Producto("Torta",17);
        Producto c = new Producto("Banana",34);
        Producto d = new Producto("Pasta",20);
        Producto e = new Producto("Arroz",48);
        Producto f = new Producto("o",15);

        registroa.agregarProducto(a,21);
        registroa.agregarProducto(b,1);
        registroa.agregarProducto(c,0);
        registroa.agregarProducto(d,5);
        registroa.agregarProducto(e,7);
        registroa.agregarProducto(f,9);

        registroa.eliminarProducto(b);

        registroa.valorMonetarioDeposito();

        registroa.productosSinStock();

        registroa.stockSegunNombre("o");

        registroa.productosCon15Unidades();
}
}
