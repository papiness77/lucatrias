package com.company;

public class Cancion {
    private String nombre;
    private int precio=500;
    Cancion(String nombre){
        this.nombre=nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}