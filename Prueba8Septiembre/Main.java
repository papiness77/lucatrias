package com.company;

public class Main {
    public static void main(String []args){
        Empresa empresa1 = new Empresa();
        Cantante cantante1= new Cantante("Mariano","marines",2,"HAOSA");
        Cantante cantante2= new Cantante("Bruno","Cala",23,"HAOSrrrwrwA");

        Cancion cancion1 = new Cancion("Bue");
        Cancion cancion2 = new Cancion("Buenas");
        Cancion cancion3 = new Cancion("Chau");

        Cancion cancion34 = new Cancion("Fiesta");
        Cancion cancion4 = new Cancion("Pluma");
        Cancion cancion6 = new Cancion("Dai");

        Album album1 = new Album("Donda");
        Album album2 = new Album("CLF");
        Album album3 = new Album("Pablo");

        album1.aniadirCanciones(cancion1);
        album1.aniadirCanciones(cancion2);
        album1.aniadirCanciones(cancion3);

        album2.aniadirCanciones(cancion4);
        album2.aniadirCanciones(cancion6);
        album2.aniadirCanciones(cancion34);

        cantante1.aniadirAlbumes(album1);
        cantante2.aniadirAlbumes(album2);
        cantante2.aniadirAlbumes(album3);

        cantante1.cantidadDeAlbums();
        cantante2.mostrarCantanteYPrecio();
        cantante1.imprimir();

        empresa1.aniadirCantante(cantante1);
        empresa1.aniadirCantante(cantante2);

        empresa1.cantantesYPrecios();
        empresa1.cantantesCon3Albums();
        empresa1.cantantes();









    }
}