public class main {
    public static void main(String[] args){
        Viaje viaje1 = new Viaje(22,13,"1Abril");
        TarjetaEquis tarjetaEquis1 = new TarjetaEquis(100,-100,1);
        Pasajero pasajero1 = new Pasajero("Bruno","Marian",tarjetaEquis1);
        TarjetaEquis tarjetaEquis2 = new TarjetaEquis(1,-40,2);
        Pasajero pasajero2 = new Pasajero("Juan","Carlos",tarjetaEquis2);
        TarjetaEquis tarjetaEquis3 = new TarjetaEquis(300,-100,3);
        Pasajero pasajero3 = new Pasajero("Gonzalo","Gonzalez",tarjetaEquis3);
        SistemaRegistro sistemaRegistro = new SistemaRegistro();
        sistemaRegistro.subePasajero(pasajero1,viaje1);
        sistemaRegistro.subePasajero(pasajero2,viaje1);
        sistemaRegistro.subePasajero(pasajero3,viaje1);
        sistemaRegistro.seBajaPasajero(pasajero1);
        sistemaRegistro.pasajerosQueSeHanSubidoAlgunaVez();
        sistemaRegistro.pasajeroConUltimoMontoAbonado();
        sistemaRegistro.ultimoMontoAbondaoPorPasajero(1);
        sistemaRegistro.seSuperaElSaldoNegativo(pasajero2);
    }
}