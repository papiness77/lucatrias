package com.company;
public class main {
    public static void main(String[] args) {
        Persona a = new Persona();
        Persona b = new Persona("Campana 4572");
        Persona c = new Persona();
        Persona v = new Persona();


        //Primera Instancia: COvertir edad al doble de la misma
        int k;
        k = a.getEdad();
        k = k * 2;
        a.setEdad(k);
        //Segunda instanica: Cambiar valor telefono
        int f = 156995;
        a.setTelefono(f);
        //Tercera instancia: Imprimir todos los datos
        String h = a.getnombre();
        k = a.getEdad();
        int d = a.getDni();
        f = a.getTelefono();
        String e = a.getDireccion();

        System.out.println(h);
        System.out.println(k);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);

        a.EsMayor();
        c.SonMismaPersona(v);
        a.TienenMismaEdad(b);
    }
}