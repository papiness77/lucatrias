package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        sistemaRegistro sistemaRegistro = new sistemaRegistro();
        boolean hola  = true;
        while(hola){
            System.out.println("Que quiere hacer: 1-Ingresar programa,2-Ingresar6-Salir");
            int respuesta = scanner.nextInt();
            switch (respuesta){
                case 1:
                    String nombre=null;
                    int fechaDeIngreso;
                    System.out.println("Ingrese nombre");
                    nombre = scanner.next();
                    System.out.println("Ingrese  fecha de ingreso");
                    fechaDeIngreso = scanner2.nextInt();
                    Persona a = new Persona(nombre,fechaDeIngreso);
                case 6:
                    System.exit(0);
            }



        }
    }
}