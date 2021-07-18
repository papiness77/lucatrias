package com.company;
import java.util.Scanner;
public class main {​​​​​​​​
    public static void main(String[] args){​​​​​​​​
    producto a = new producto("apa",33);
producto b = new producto("apas",41);
producto e = new producto("apat",31);
producto f = new producto("bapa",23);
producto g = new producto("puedeserpa",33);
producto h = new producto("apaco",36);
producto i = new producto("alpaapa",3344);
producto k = new producto("papota",3453336);
SistemaRegistro asa = new SistemaRegistro();
asa.RegistrProducto(a);
asa.RegistrProducto(b);
asa.RegistrProducto(e);
asa.RegistrProducto(f);
asa.RegistrProducto(g);
asa.RegistrProducto(h);
asa.RegistrProducto(i);
asa.RegistrProducto(k);
asa.verImporteParcial();
asa.AgregagarProducto();
asa.verImporteTotal();
}​​​​​​​​
}​​​​​​​​


