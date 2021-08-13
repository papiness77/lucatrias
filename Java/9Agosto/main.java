public class main {
    public static void main(String[] args){
        Viaje viaje1 = new Viaje(1000,1,"1Enero");
        Viaje viaje2 = new Viaje(32,15,"40Enero");
        TarjetaEquis tarjetaEquis1 = new TarjetaEquis(100,-100,1234);
        Pasajero pasajero1 = new Pasajero("Facundo","Sabelli",tarjetaEquis1);
        TarjetaEquis tarjetaEquis2 = new TarjetaEquis(1,-1,5678);
        Pasajero pasajero2 = new Pasajero("Pablo","Suarez",tarjetaEquis2);
        TarjetaEquis tarjetaEquis3 = new TarjetaEquis(2,-2,1357);
        Pasajero pasajero3 = new Pasajero("Roberto","Gonzalez",tarjetaEquis3);
        SistemaRegistro sistemaRegistro = new SistemaRegistro();
        sistemaRegistro.subePasajero(pasajero1,viaje1);
        sistemaRegistro.subePasajero(pasajero2,viaje1);
        sistemaRegistro.subePasajero(pasajero3,viaje1);
        sistemaRegistro.seBajaPasajero(pasajero1);
        sistemaRegistro.pasajerosQueSeHanSubidoAlgunaVez();
        sistemaRegistro.pasajeroConUltimoMontoAbonado();
        sistemaRegistro.ultimoMontoAbondaoPorPasajero(1);
        sistemaRegistro.seSuperaElSaldoNegativo(pasajero2);
        tarjetaEquis1.realizarViaje(viaje1);
        tarjetaEquis1.realizarViaje(viaje2);
        System.out.println(viaje1.toString());
        System.out.println(tarjetaEquis1.toString());
        System.out.println(pasajero1.toString());
    }
}