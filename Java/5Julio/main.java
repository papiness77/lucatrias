import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SistemaRegistro sistemaRegistro1 = new SistemaRegistro();
        Alumno alumno1 = new Alumno("Luca", "Trias", 5);
        Profesor profesor1 = new Profesor("Marcela", "Fernandez");
        Platos plato1 = new Platos("arroz", 5);
        Platos plato2 = new Platos("fideos", 10);
        Pedidos pedidos1 = new Pedidos("1Abril", 12, false, alumno1, plato1);
        Pedidos pedidos2 = new Pedidos("4Abril", 17, false, profesor1, plato2);
        sistemaRegistro1.agregarPersonaNoOficial(alumno1);
        sistemaRegistro1.agregarPersonaNoOficial(profesor1);
        sistemaRegistro1.agregarPlatosNoOficial(plato1);
        sistemaRegistro1.agregarPlatosNoOficial(plato2);
        sistemaRegistro1.agregarPedidosNoOficial(pedidos1);
        sistemaRegistro1.agregarPedidosNoOficial(pedidos2);
        boolean programa = true;
        int eleccion = 0;
        int eleccioncosa = 0;
        Scanner scanner = new Scanner(System.in);
        while (programa == true) {
            if (eleccion == 0) {
                System.out.println("Que quiere hacer:1-Agregar,2-Modificar,3-Eliminar,4-Salir del sistema,5-Ver Platos del Dia");
                eleccion = scanner.nextInt();
            }
            else if (eleccion == 1) {
                System.out.println("Que quiere agregar:1-Persona,2-Plato,3-Pedido");
                eleccioncosa = scanner.nextInt();
                if (eleccioncosa == 1) {
                    sistemaRegistro1.agregarPersonas();
                    eleccion = 0;
                    eleccioncosa = 0;
                } else if (eleccioncosa == 2) {
                    sistemaRegistro1.agregarPlatos();
                    eleccioncosa = 0;
                    eleccion = 0;
                } else if (eleccioncosa == 3) {
                    sistemaRegistro1.agregarPedidos();
                    eleccion = 0;
                    eleccioncosa = 0;
                }
            }
            else if (eleccion == 2) {
                System.out.println("Que quiere modificar:1-Persona,2-Plato,3-Pedido");
                eleccioncosa = scanner.nextInt();
                if (eleccioncosa == 1) {
                    sistemaRegistro1.modificarPersonas();
                    eleccion = 0;
                    eleccioncosa = 0;
                } else if (eleccioncosa == 2) {
                    sistemaRegistro1.modificarPlatos();
                    eleccioncosa = 0;
                    eleccion = 0;
                } else if (eleccioncosa == 3) {
                    sistemaRegistro1.modificarPedidos();
                    eleccion = 0;
                    eleccioncosa = 0;
                }
            }
            else if (eleccion == 3) {
                System.out.println("Que quiere eliminar:1-Persona,2-Plato,3-Pedido");
                eleccioncosa = scanner.nextInt();
                if (eleccioncosa == 1) {
                    sistemaRegistro1.eliminarPersona();
                    eleccion = 0;
                    eleccioncosa = 0;
                } else if (eleccioncosa == 2) {
                    sistemaRegistro1.eliminarPlatos();
                    eleccioncosa = 0;
                    eleccion = 0;
                } else if (eleccioncosa == 3) {
                    sistemaRegistro1.eliminarPedidos();
                    eleccion = 0;
                    eleccioncosa = 0;
                }
            }
            else if (eleccion == 4) {
                programa=false;
            }
            else if (eleccion==5) {
                eleccion=0;
                sistemaRegistro1.PlatosAcocinarEnElDIa();
            }
        }
    }
}
