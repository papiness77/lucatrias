package com.company;
import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.*;
public class TestSistemasRegistro {
    @Test
    public void testPasajerosQueSeHanSbidoAlgunaVez(){
        TarjetaEquis tarjeta1 = new TarjetaEquis(300,-100,12);
        TarjetaEquis tarjeta2 = new TarjetaEquis(200,-100,14);
        Viaje viaje= new Viaje(30,20,"hola");
        Pasajero a = new Pasajero("Facu","Sabelli",tarjeta1);
        Pasajero b = new Pasajero("Nacho","Avichelli",tarjeta2);
        SistemaRegistro sistemaRegistro = new SistemaRegistro();
        sistemaRegistro.subePasajero(a,viaje);
        sistemaRegistro.subePasajero(b,viaje);
        sistemaRegistro.seBajaPasajero(a);
        HashSet<Pasajero> hashSet = new HashSet<>();
        hashSet.add(a);
        hashSet.add(b);
        assertEquals(hashSet,sistemaRegistro.pasajerosQueSeHanSubidoAlgunaVez());
    }
    @Test
    public void testPasajerosConUltimoMOntoAbonado(){
        TarjetaEquis tarjeta1 = new TarjetaEquis(300,-100,12);
        TarjetaEquis tarjeta2 = new TarjetaEquis(200,-100,14);
        Viaje viaje= new Viaje(30,20,"hola");
        Pasajero a = new Pasajero("Facu","Sabelli",tarjeta1);
        Pasajero b = new Pasajero("Nacho","Avichelli",tarjeta2);
        SistemaRegistro sistemaRegistro = new SistemaRegistro();
        sistemaRegistro.subePasajero(a,viaje);
        float valorEsperado = 30;
        assertEquals(valorEsperado,sistemaRegistro.ultimoMontoAbondaoPorPasajero(12),0);
    }
    @Test
    public void testSeSuperaElSaldoNegativo(){
        TarjetaEquis tarjeta1 = new TarjetaEquis(300,-100,12);
        TarjetaEquis tarjeta2 = new TarjetaEquis(200,-100,14);
        Viaje viaje= new Viaje(30,20,"hola");
        Pasajero a = new Pasajero("Facu","Sabelli",tarjeta1);
        Pasajero b = new Pasajero("Nacho","Avichelli",tarjeta2);
        SistemaRegistro sistemaRegistro = new SistemaRegistro();
        sistemaRegistro.subePasajero(a,viaje);
        boolean valorEsperado = false;
        assertEquals(valorEsperado,sistemaRegistro.seSuperaElSaldoNegativo(a));
    }
}
