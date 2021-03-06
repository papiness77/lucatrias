package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Programa {
    private String nombrePrograma;
    private HashMap<String,Integer> diasYHorarios;
    private ArrayList<Persona> conductoresArrayList;
    private Persona operadorTecnico;
    private final String categoria;
    private Persona musicalizador;
    private ArrayList<String> estilosDeMusica;

    public Programa(String nombrePrograma,Persona operadorTecnico,String categoria){
        this.nombrePrograma=nombrePrograma;
        this.operadorTecnico=operadorTecnico;
        this.categoria=categoria;
        this.diasYHorarios=new HashMap<>();
        this.conductoresArrayList=new ArrayList<>();
    }

    public String getCategoria(){return categoria;}
    public String getNombrePrograma(){return nombrePrograma;}
    public void setNombrePrograma(String nombrePrograma){this.nombrePrograma=nombrePrograma;}
    public HashMap<String,Integer>getDiasYHorarios(){return diasYHorarios;}
    public void setDiasYHorarios(HashMap<String,Integer>diasYHorarios){this.diasYHorarios=diasYHorarios;}
    public ArrayList<Persona>getConductoresArrayList(){return conductoresArrayList;}
    public void setConductoresArrayList(ArrayList<Persona>conductoresArrayList){this.conductoresArrayList=conductoresArrayList;}
    public Persona getOperadorTecnico(){return operadorTecnico;}
    public void setOperadorTecnico(Persona operadorTecnico){this.operadorTecnico=operadorTecnico;}
    public Persona getMusicalizador(){return musicalizador;}
    public void setMusicalizador(Persona musicalizador){this.musicalizador=musicalizador;}
    public ArrayList<String>getEstilosDeMusica(){return estilosDeMusica;}
    public void setEstilosDeMusica(ArrayList<String>estilosDeMusica){this.estilosDeMusica=estilosDeMusica;}

    public void chequearCategoria(Persona a,ArrayList<String> b){
        if(this.categoria.equals("musica")){
            musicalizador=a;
            estilosDeMusica= b;
        }
    }



}