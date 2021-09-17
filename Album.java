package com.company;

import java.util.ArrayList;

public class Album {
    private String nombre;
    private ArrayList<Cancion> cancionArrayList;
    Album(String nombre){
        this.nombre=nombre;
        this.cancionArrayList=new ArrayList<>();
    }
    public void aniadirCanciones(Cancion a){
        this.cancionArrayList.add(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void recorrerCanciones(int precio){
        for(Cancion a:this.cancionArrayList){
            a.setPrecio(precio);
        }
    }
    public String imprimirCanciones(){
        String hola = "";
        for(Cancion a:this.cancionArrayList){
            hola += "\n"+a.getNombre();
        }
        return hola;
    }
}
