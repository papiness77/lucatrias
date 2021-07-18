
public class main {
    public static void main(String[] args){
        Duenio a = new Duenio();
        Duenio b = new Duenio();
        
        Vivienda Casa = new Vivienda("Campana 123");
        Empresa veinticuatro = new Empresa("Salvador 321","Kiosco");

        Casa.AgregarDuenio(a,"Fernando",52,4501788);
        veinticuatro.AgregarDuenio(b,"JUan",34,3);

        Casa.CargarConsumo(3);
        Casa.CalcularConsumo();

        veinticuatro.CargarConsumo(2);
        veinticuatro.CalcularConsumo1();

}

}
