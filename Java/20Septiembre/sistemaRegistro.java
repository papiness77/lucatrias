import java.util.HashSet;

public class sistemaRegistro {
    private HashSet<Programa> programaHashSet;
    public sistemaRegistro(){
        this.programaHashSet= new HashSet<>();
    }
    public void aniadirYChequear(Programa programaAAnidair){
        for(Programa a :this.programaHashSet){
            if(a.getDias()!=programaAAnidair.getDias() && a.getHorario()!=programaAAnidair.getHorario()){
                this.programaHashSet.add(programaAAnidair);
            }
        }
    }

}