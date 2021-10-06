public class Main {
    public static void main(String[]args){
        Sala sala1=new Sala(1,55);
        Visitante visitante1=new Visitante(1,33);
        Visitante visitante2=new Visitante(12,13);
        Visitante visitante3=new Visitante(13,35);
        sala1.aniadirPersonasASala(visitante1);
        sala1.aniadirPersonasASala(visitante2);
        sala1.aniadirPersonasASala(visitante3);
        sala1.salenPersonasDeLaSala(visitante3);

        Cine cine = new Cine("Devoto",2313);
        cine.aniadirSala(sala1);

        System.out.println(cine.visitantes());
        System.out.println(cine.cantidadTotalDeVisitantes());
        System.out.println(cine.visitantesConCantidadDeVisitas());
        System.out.println(cine.informeActualCine());


    }
}
