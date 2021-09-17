import java.util.HashSet;
public class Album {
    private String tituloAlbum;
    private HashSet<Cancion> cancionHashSet;
    public Album(String tituloAlbum){
        this.tituloAlbum= tituloAlbum;
        this.cancionHashSet=new HashSet<>();
    }
    public void addCancion(Cancion a){
        this.cancionHashSet.add(a);
    }
    public String artistasParticiparonAlbum(){
        String reetorno = null;
        for(Cancion a : this.cancionHashSet){
             reetorno = a.artistasParticiparonCancion();
        }
        return  reetorno;
    }
    public String autorNacionalidadIngresadaAlbum(String nacionalidadDeseada){
        String retorno=null;
        for(Cancion a : this.cancionHashSet){
            retorno+=a.autorNacionalidadIngresadaCancion(nacionalidadDeseada);
        }
        return retorno;
    }
    public void usarContadorArtistas(){
        for(Cancion a : this.cancionHashSet){
            a.aniadirContadorAArtista();
        }
    }
    public String artistasMasInfluyente(){
        String retorno = null;
        for (Cancion a : this.cancionHashSet){
           retorno= a.artistaConMas();
        }
        return retorno;
    }
}

