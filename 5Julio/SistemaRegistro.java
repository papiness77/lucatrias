import java.util.ArrayList;
import java.util.Scanner;
public class SistemaRegistro {
    private ArrayList<persona> arrayListPersonas;
    private ArrayList<Platos> arrayListPlatos;
    private ArrayList<Pedidos> arrayListPedidos;

    public SistemaRegistro() {
        this.arrayListPersonas = new ArrayList<>();
        this.arrayListPlatos = new ArrayList<>();
        this.arrayListPedidos = new ArrayList<>();
    }

    public void agregarPersonaNoOficial(persona a) {
        this.arrayListPersonas.add(a);
    }

    public void agregarPlatosNoOficial(Platos a) {
        this.arrayListPlatos.add(a);
    }

    public void agregarPedidosNoOficial(Pedidos a) {
        this.arrayListPedidos.add(a);
    }

    public void agregarPersonas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre y apellido");
        String nombres21 = scanner.nextLine();
        String apellidos21 = scanner.nextLine();
        System.out.println("Creara una 1-Profesor o un 2-Alumno");
        int decision = scanner.nextInt();
        if (decision == 1) {
            Profesor a = new Profesor(nombres21, apellidos21);
            this.arrayListPersonas.add(a);
        } else {
            System.out.println("Ingrese una division");
            int division21 = scanner.nextInt();
            Alumno a = new Alumno(nombres21, apellidos21, division21);
            this.arrayListPersonas.add(a);
        }
    }

    public void modificarPersonas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apellido de la persona que va a modificar");
        String apellidomodificar = scanner.nextLine();
        boolean existe = false;
        for (persona a : this.arrayListPersonas) {
            if (a.getApellido().equals(apellidomodificar)) {
                System.out.println("Ingrese el nuevo nombre y apellido");
                String nuevonombre = scanner.nextLine();
                String nuevoapellido = scanner.nextLine();
                a.setNombre(nuevonombre);
                a.setApellido(nuevoapellido);
                existe = true;
            }
        }
        if (existe == false) System.out.println("No existe esa persona");
    }

    public void eliminarPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apellido de la persona que va a eliminar");
        String apellidoelimiar = scanner.nextLine();
        boolean existe = false;
        for (persona a : this.arrayListPersonas) {
            if (a.getApellido().equals(apellidoelimiar)) {
                System.out.println("La persona fue eliminada");
                this.arrayListPersonas.remove(a);
                existe = true;
            }
        }
        if (existe == false) System.out.println("No existe esa persona");
    }


    public void agregarPlatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre y precio");
        String nombres21 = scanner.nextLine();
        int precio21 = scanner.nextInt();
        Platos a = new Platos(nombres21, precio21);
        this.arrayListPlatos.add(a);
    }

    public void modificarPlatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato a modificar");
        String nombremodificar = scanner.nextLine();
        boolean existe = false;
        for (Platos a : this.arrayListPlatos) {
            if (a.getNombreplato().equals(nombremodificar)) {
                System.out.println("Ingrese el nuevo nombre y precio");
                String nuevonombre = scanner.nextLine();
                int nuevoprecio = scanner.nextInt();
                a.setNombreplato(nuevonombre);
                a.setPrecio(nuevoprecio);
                existe = true;
            }
        }
        if (existe == false) System.out.println("No existe ese plato");
    }

    public void eliminarPlatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato  que va a eliminar");
        String platoaeliminar = scanner.nextLine();
        boolean existe = false;
        for (Platos a : this.arrayListPlatos) {
            if (a.getNombreplato().equals(platoaeliminar)) {
                System.out.println("Plato" + a.getNombreplato() + "fue eliminado");
                this.arrayListPlatos.remove(a);
                existe = true;
            }
        }
        if (existe == false) System.out.println("No existe ese plato");
    }


    public void agregarPedidos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese fecha de creacion,apellido de persona que pidio,nombre del plato,hora de entrega, si fue entregado 1 y si no 2");
        String fecha21 = scanner.nextLine();
        String apellido21 = scanner.nextLine();
        String nombreplato21 = scanner.nextLine();
        int horaentrega21 = scanner.nextInt();
        int entregado = scanner.nextInt();
        boolean existepersona = false;
        boolean existeplato = false;
        boolean entregados = false;
        persona b = new persona("a", "a");
        Platos z = new Platos("a", 1);
        for (persona a : this.arrayListPersonas) {
            if (a.getApellido().equals(apellido21)) {
                existepersona = true;
                b.setNombre(a.getNombre());
                b.setApellido(a.getApellido());
            }
        }
        for (Platos x : this.arrayListPlatos) {
            if (x.getNombreplato().equals(nombreplato21)) {
                existeplato = true;
                z.setNombreplato(x.getNombreplato());
                z.setPrecio(x.getPrecio());
            }
        }
        if (entregado == 1) {
            entregados = true;
        } else if (entregado == 2) {
            entregados = false;
        }
        if (existepersona == true && existeplato == true) {
            Pedidos a = new Pedidos(fecha21, horaentrega21, entregados, b, z);
            this.arrayListPedidos.add(a);
        } else if (existepersona == false || existeplato == false) {
            System.out.println("no existe esa persona o ese plato");
        }
    }

    public void modificarPedidos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apellido de la persona que pidio y el plato que pidio");
        String personaqueordeno = scanner.nextLine();
        String platoquepidio = scanner.nextLine();
        persona a = new persona("a", "a");
        boolean existe = false;
        Platos b = new Platos("a", 1);
        for (Pedidos c : this.arrayListPedidos) {
            a = c.getPersonaQuePidio();
            b = c.getPlatoQuePidio();
            if (a.getApellido().equals(personaqueordeno) && b.getNombreplato().equals(platoquepidio)) {
                existe = true;
                System.out.println("Ingrese fecha de creacion y hora de entrega");
                String fecha21 = scanner.nextLine();
                int horaentrega21 = scanner.nextInt();
                c.setFechaDeCreacion(fecha21);
                c.setHoraEntrega(horaentrega21);
            }
        }
        if (existe == false) System.out.println("no existe ese pedido");

    }

    public void eliminarPedidos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apellido de la persona que pidio y el plato que pidio");
        String personaqueordeno = scanner.nextLine();
        String platoquepidio = scanner.nextLine();
        persona a = new persona("a", "a");
        boolean existe = false;
        Platos b = new Platos("a", 1);
        for (Pedidos c : this.arrayListPedidos) {
            a = c.getPersonaQuePidio();
            b = c.getPlatoQuePidio();
            if (a.getApellido().equals(personaqueordeno) && b.getNombreplato().equals(platoquepidio)) {
                existe = true;
                this.arrayListPedidos.remove(c);
                System.out.println("El pedido fue removida exitosamente");
            }
        }
        if (existe == false) System.out.println("no existe ese pedido");
    }

    public void PlatosAcocinarEnElDIa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De que dia quiere ver los pedidos");
        String diapedido = scanner.nextLine();
        Platos b = new Platos("a", 2);
        boolean existe = false;
        for (Pedidos a : this.arrayListPedidos) {
            if (diapedido.equals(a.getFechaDeCreacion())) {
                b = a.getPlatoQuePidio();
                System.out.println(b.getNombreplato() + b.getPrecio());
                existe = true;
            }
        }
        if(existe==false)System.out.println("No existen pedidos en ese dia");
    }
}