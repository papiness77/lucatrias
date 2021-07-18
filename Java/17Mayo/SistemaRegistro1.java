import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
    public class SistemaRegistro1{
        private ArrayList<Libro> ArrayLibro;
        private HashMap<String, Integer> MapLibros;
        public SistemaRegistro1() {
            this.ArrayLibro = new ArrayList<>();
            this.MapLibros = new HashMap<>();
        }

        public void APA(Libro a){
            this.ArrayLibro.add(a);
        }
        public void S(){
            Scanner apa = new Scanner(System.in);
            System.out.println("Sobre que editorial quiere ver las ventas");
            System.out.println("1-ASHE,2-NASHE,3-SHESH,4-AYAY,5-MIL");
            int pregunta = apa.nextInt();
            int as = 0;
            int bs = 0;
            int cs = 0;
            int ds = 0;
            int es = 0;
            for(Libro a: ArrayLibro){
                if(a.getNombreEditorial()== "ASHE"){
                    as += 1;
                }
                if(a.getNombreEditorial()== "NASHE"){
                    bs += 1;
                }
                if(a.getNombreEditorial()== "SHESH"){
                    cs += 1;
                }
                if(a.getNombreEditorial()== "AYAY"){
                    ds += 1;
                }
                if(a.getNombreEditorial()== "MIL"){
                    es += 1;
                }
            }
            if(pregunta==1){
                System.out.println("La editorial que eligio vendio"+ as +"libros");
            }
            else if(pregunta==2){
                System.out.println("La editorial que eligio vendio"+ bs +"libros");
            }
            else if(pregunta==3){
                System.out.println("La editorial que eligio vendio"+ cs +"libros");
            }
            else if(pregunta==4){
                System.out.println("La editorial que eligio vendio"+ ds +"libros");
            }
            else if(pregunta==5){
                System.out.println("La editorial que eligio vendio"+ es +"libros");
            }
            MapLibros.put("ASHE",as);
            MapLibros.put("NASHE",bs);
            MapLibros.put("SHESH",cs);
            MapLibros.put("AYAY",ds);
            MapLibros.put("MIL",es);
            System.out.println("Ahora va a ver los libros vendidos por editorial(Hash Map)");
            for(String i : MapLibros.keySet()){
                System.out.println("La editorial"+i+"vendio"+MapLibros.get(i));

            }
        }
    }

