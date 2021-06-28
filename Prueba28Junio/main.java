
public class main {
    public static void main(String[] args){
        banco a = new banco("Galicia");
        cliente z = new cliente("Fernando",1533,173);
        cliente b = new cliente("Fernand",1445,764);
        cliente c = new cliente("Fernan",115,873);
        cliente d = new cliente("Ferna",125,176);
        cliente e = new cliente("Fer",153,511);
        cliente f = new cliente("Fe",154,233);

        a.agregarClientesVisitantes(z);
        a.agregarClientesVisitantes(b);
        a.agregarClientesVisitantes(c);
        a.agregarClientesVisitantes(d);
        a.agregarClientesVisitantes(e);
        a.agregarClientesVisitantes(f);

        a.cbusDeClientesVisitantes();
        a.imprimirHashSet(a.cbusDeClientesVisitantes());
        a.cantidadDeVisitasPorCliente(13,f);
        a.imprimirHashMap(a.cantidadDeVisitasPorCliente(13,f));

}
}
