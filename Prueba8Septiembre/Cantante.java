package com.company;

import com.company.Persona;

import java.util.ArrayList;

public class Cantante extends Persona {
    private String nombreArtistico;
    private ArrayList<Album> albumsRealizados;
    public Cantante(String nombre, String apellido, int edad,String nombreArtistico) {
        super(nombre, apellido, edad);
        this.nombreArtistico=nombreArtistico;
        this.albumsRealizados= new ArrayList<>();
    }

    public void aniadirAlbumes(Album a){
        this.albumsRealizados.add(a);
    }
    public void cantidadDeAlbumesCantante(){
        int precio = this.cantidadDeAlbums()*500;
        for(Album a: this.albumsRealizados){
            a.recorrerCanciones(precio);
        }
    }
    public String  mostrarCantanteYPrecio(){
        String retorno = "nombre: "+ this.nombreArtistico+"\nprecio: "+this.cantidadDeAlbums()*500;
        System.out.println(retorno);
        return retorno;
    }
    public int cantidadDeAlbums(){
        int retorno = this.albumsRealizados.size();
        return retorno;
    }
    public String getNombreArtistico(){
        return nombreArtistico;
    }

    @Override
    public String imprimir() {
        super.imprimir();
        String hola = "Nombre artistico: "+ this.nombreArtistico;
        for(Album a : this.albumsRealizados){
            hola += "\nAlbum: "+ a.getNombre()+"\n"+ a.imprimirCanciones();
        }
        System.out.println(hola);
        return hola;
    }
}