package com.company;

import java.util.ArrayList;

public class Empresa{
    ArrayList<Cantante> cantanteArrayList;
    Empresa(){
        this.cantanteArrayList=new ArrayList<>();
    }
    public void aniadirCantante(Cantante a){
        this.cantanteArrayList.add(a);
    }
    public void cantantesYPrecios(){
        for(Cantante a : this.cantanteArrayList){
            a.mostrarCantanteYPrecio();
        }
    }
    public String cantantesCon3Albums(){
        String retorno = "";
        for(Cantante a:this.cantanteArrayList){
            if(a.cantidadDeAlbums()>=3){
                retorno+=a.getNombreArtistico();
            }
        }
        return retorno;
    }
    public String cantantes(){
        String hola="";
        for(Cantante a:this.cantanteArrayList){
            hola +=  a.imprimir();
        }
        System.out.println(hola);
        return hola;
    }

}