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


