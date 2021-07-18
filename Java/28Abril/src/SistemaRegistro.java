import java.util.ArrayList;
import java.util.Scanner;
public class SistemaRegistro{
    private ArrayList<Persona> ArrayPersona;
    public SistemaRegistro(){
        this.ArrayPersona = new ArrayList<>();
    }
    public void IniciarSistema(){
    }
    public void RegistrPersona(Persona a){
        this.ArrayPersona.add(a);
    }
    public void AgregagarPersona(){
        Scanner miObj = new Scanner(System.in);
        System.out.println("Cuantos personas quiere agregar");
        float preguntapersonas = miObj.nextFloat();
        for (int i=0;i<preguntapersonas;i++){
            Scanner Nuevonombre = new Scanner(System.in);
            System.out.println("Que nombre tiene la persona");
            String nombrepersona = Nuevonombre.nextLine();
            Scanner Nuevaedad = new Scanner(System.in);
            System.out.println("Cuanto edad tiene esta persona");
            int personaedad = Nuevaedad.nextInt();
            Scanner Nuevodni = new Scanner(System.in);
            System.out.println("Cual es el dni de esta persona");
            int nuevodnipersona = Nuevodni.nextInt();
            Persona a = new Persona(nombrepersona,personaedad,nuevodnipersona);
            this.ArrayPersona.add(a);
        }
    }
    public void EliminarPersona(){
        Scanner Dnipersonaaeliminar = new Scanner(System.in);
        System.out.println("Ingrese el dni de la persona que desea eliminar de esta vida");
        int dnipersonaeliminar = Dnipersonaaeliminar.nextInt();
        boolean asssa = false;
        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            int afipa=a.getDni();
            if(afipa==dnipersonaeliminar){
                asssa = true;
                System.out.println(a.getNombre()+"Esta persona fue borrada");
                this.ArrayPersona.remove(a);
                break;
            }
        }
        if(asssa==false){
            System.out.println("Esta persona no existe");
        }
    }
    public void ModificarDatosPersona(){
        Scanner Dnipersonaacambiar = new Scanner(System.in);
        System.out.println("Ingrese el dni de la persona que desea modificar");
        int dnipersonacambiar = Dnipersonaacambiar.nextInt();
        boolean asssa = false;
        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            if(a.getDni()==dnipersonacambiar){
                asssa = true;
                Scanner SNUevodni = new Scanner(System.in);
                Scanner SNUevonombre = new Scanner(System.in);
                Scanner SNUevaedad = new Scanner(System.in);
                System.out.println("Cual sera el nuevo nombre de la persona");
                String Nuevonombre = SNUevonombre.nextLine();
                System.out.println("Cuanto edad tiene esta persona");
                int Nuevaedad= SNUevaedad.nextInt();
                System.out.println("Cual es el dni de esta persona");
                int Nuevodni = SNUevodni.nextInt();
                a.setEdad(Nuevaedad);
                a.setNombre(Nuevonombre);
                a.setDni(Nuevodni);
            }
        }
        if(asssa==false){
            System.out.println("Esta persona no existe");
        }
    }
    public void PersonasMayores18(){
        System.out.println("Personas mayor de 18 son:");
        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            if(a.getEdad()>=18){
                String afaa=a.getNombre();
                System.out.println(afaa);
            }
        }
    }
    public void ImprimirTodaslasPersonas(){
        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            String nombre =a.getNombre();
            System.out.println(nombre);
        }
    }



}