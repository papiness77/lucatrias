package com.company;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int fechaDeIngreso;

    public Persona(String nombre,String apellido,int dni,int fechaDeIngreso){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni= dni;
        this.fechaDeIngreso=fechaDeIngreso;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(int fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
}