[8:54] SABELLI Facundo Tobias
    

publicvoidIniciarSistema(){​​​​​​​​
booleancomenzar = true
while(comenzar){​​​​​​​​
System.out.println("se ha iniciado el sistema");
System.out.println("presione 1---si quieres iniciar el sistema");
System.out.println("presione 2---si quieres registrar a alguna persona");
System.out.println("presione 3---si quieres agregar a alguna persona");
System.out.println("presione 4---si quieres eliminar a alguna persona");
System.out.println("presione 5---si quieres modificar a alguna persona");
System.out.println("presione 6---si quieres saber si la persona es mayor de edad");
System.out.println("presione 7---si quieres imprimir todas las personas");
System.out.println("presione 8---si quieres salir del sistema");
inteleccion = eleccionDePersona.nextint();
 
if(eleccionDePersona==1){​​​​​​​​
SistemaDeRegistroDePersona28.04.SistemaDeRegistro();
 }​​​​​​​​
if(eleccionDePersona==2){​​​​​​​​
SistemaDeRegistroDePersona28.04.regristrarPersona();
 }​​​​​​​​
if(eleccionDePersona==3){​​​​​​​​
SistemaDeRegistroDePersona28.04.AgregarPersona();
 }​​​​​​​​
if(eleccionDePersona==4){​​​​​​​​
SistemaDeRegistroDePersona28.04.EliminarPersona();
 }​​​​​​​​
if(eleccionDePersona==5){​​​​​​​​
SistemaDeRegistroDePersona28.04.ModificarDatosPersona();
 }​​​​​​​​
if(eleccionDePersona==6){​​​​​​​​
SistemaDeRegistroDePersona28.04.PersonasMayores18();
 }​​​​​​​​
if(eleccionDePersona==7){​​​​​​​​
SistemaDeRegistroDePersona28.04.ImprimirTodaslasPersonas();
 }​​​​​​​​
if(eleccionDePersona==8){​​​​​​​​
SistemaDeRegistroDePersona28.04.salirDelSistema();
 }​​​​​​​​
 }​​​​​​​​

​[9:26] TRIAS LUPINACCI Luca Gonzalo
    

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class SistemaRegistro12 {​​​​​​​​
    private HashSet<Integer> HashNumero;
    private HashSet<Integer> HashNumero2;
    public SistemaRegistro12() {​​​​​​​​
        this.HashNumero = new HashSet<>();
        this.HashNumero2 = new HashSet<>();
}​​​​​​​​
    public void AgregagarNumero() {​​​​​​​​
        Scanner miObj = new Scanner(System.in);
System.out.println("Cuantos numeros quiere agregar");
        float preguntapersonas = miObj.nextFloat();
        for (int i = 0; i < preguntapersonas; i++) {​​​​​​​​
            Scanner Nuevonumero = new Scanner(System.in);
System.out.println("Que numero quiere agregar");
            int numero = Nuevonumero.nextInt();
            this.HashNumero.add(numero);
}​​​​​​​​
    }​​​​​​​​
    public void AgregagarNumero2() {​​​​​​​​
        Scanner miObj = new Scanner(System.in);
System.out.println("Ingrese mas numeros");
System.out.println("Cuantos numeros quiere agregar");
        float preguntapersonas = miObj.nextFloat();
        for (int i = 0; i < preguntapersonas; i++) {​​​​​​​​
            Scanner Nuevonumero = new Scanner(System.in);
System.out.println("Que numero quiere agregar");
            int numero = Nuevonumero.nextInt();
            this.HashNumero2.add(numero);
}​​​​​​​​
    }​​​​​​​​
    public void Mismosnumeros(){​​​​​​​​
        boolean apa = false;
        for (int a : HashNumero){​​​​​​​​
            for (int b : HashNumero2){​​​​​​​​
                if(a==b){​​​​​​​​
                    apa = true;
System.out.println("Este es el numero que se repite"+a);
}​​​​​​​​
            }​​​​​​​​
        }​​​​​​​​
        if(apa==false){​​​​​​​​
            System.out.println("No hay numeros repetidos");
}​​​​​​​​
    }​​​​​​​​
    public void Imprimir () {​​​​​​​​
        for (int a : this.HashNumero) {​​​​​​​​
            System.out.println(a);
}​​​​​​​​
    }​​​​​​​​
}​​​​​​​​


