import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Alumno extends Persona{
    private String Curso;
    private ArrayList<Float> Notas;
    private HashMap<String, ArrayList<Float>> NotasPorMateria;

    public Alumno(String nombre, int edad, int dni,String Curso) {
        super(nombre, edad, dni);
        this.Curso = Curso;
        this.Notas = new ArrayList<>();
        this.NotasPorMateria = new HashMap<>();
    }
    public void AgregarNota(String Materia){
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Cuantos notas quiere agregar");
        int pregunta = Scanner1.nextInt();
        System.out.println("Que notas va a agregar");
        for (int i=0;i<pregunta;i++){
            Scanner Scanner2 = new Scanner(System.in);
            Float Notapa = Scanner2.nextFloat();
            this.Notas.add(Notapa);
            this.NotasPorMateria.put(Materia,Notas);
    }
    }

    public void MenorNotaPorMateria(){
            Scanner Scanner3 = new Scanner(System.in);
            System.out.println("Sobre que materia quiere ver la menor nota");
            String MateriaRequerida = Scanner3.nextLine();
            this.Notas = NotasPorMateria.get(MateriaRequerida);
                    float b = 100;
                    for(float i: this.Notas){
                        if(i<b){
                            b=i;
                        }
                    }
                    System.out.println(b);
                }


        public void MayorNotaPorMateria(){
            Scanner Scanner3 = new Scanner(System.in);
            System.out.println("Sobre que materia quiere ver la mayor nota");
            String MateriaRequerida = Scanner3.nextLine();
            this.Notas = NotasPorMateria.get(MateriaRequerida);
                    float b = -100;
                    for(float i: this.Notas){
                        if(i>b){
                            b=i;
                        }
                    }
            System.out.println(b);
                }

        public void PromedioNotas(){
            Scanner Scanner3 = new Scanner(System.in);
            System.out.println("Sobre que materia quiere ver la nota promedio");
            String MateriaRequerida = Scanner3.nextLine();
            this.Notas = NotasPorMateria.get(MateriaRequerida);
                    float total = 0;
                    int h =0;
                    for(float i: this.Notas){
                        total = total + i;
                        h +=1;
                    }
                        float totalenserio =0;
                        totalenserio = total/h;
                        System.out.println(totalenserio);
                    }
                }




