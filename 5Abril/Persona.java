package com.company;
public class Persona {
    private  String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona (){
        nombre= "Jose";
        edad = 35;
        dni=1231;
        telefono=157164;
        direccion= "Villa nashe";
    }
    public Persona (String nuevadireccion){
        nombre= "King kunta";
        edad = 70;
        dni=3421;
        telefono=154444;
        direccion= nuevadireccion;
    }
    public Persona (String nuevonombre,int nuevaedad,int nuevodni,int nuevotelefono,String nuevadireccion){
        nombre= nuevonombre;
        edad = nuevaedad;
        dni= nuevodni;
        telefono=nuevotelefono;
        direccion= nuevadireccion;
    }

    public String getnombre(){
        return nombre;
    }
    public void setNombre(String nuevonombre) {
        nombre = nuevonombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int nuevaedad) {
        edad = nuevaedad;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int nuevodni) {
        dni = nuevodni;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int nuevotelefono) {
        telefono = nuevotelefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String nuevadireccion) {
        direccion = nuevadireccion;
    }

    public void EsMayor(){
        if (edad >= 18){
            System.out.println("es mayor");
        }
        else{
            System.out.println("es menor");
        }
    }
    public void SonMismaPersona(Persona b){
        if(this.getnombre() == b.getnombre() && this.getEdad() == b.getEdad() && this.getDni() == b.getDni() && this.getTelefono() == b.getTelefono() && this.getDireccion() == b.getDireccion() ){
            System.out.println("Misma Persona");
        }
        else{
            System.out.println("Misma Persona");
        }
    }
    public void TienenMismaEdad(Persona b){
        if(this.getEdad() == b.getEdad()){
            System.out.println("tienen la misma edad");
        }
        else{
            System.out.println("no tienen la misma edad");
        }
    }
}

