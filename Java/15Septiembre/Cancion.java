import java.util.HashSet;
public class Cancion {
    private String tituloCancion;
    private HashSet<Artista> artistasHashSet;
    private HashSet<Autor> autoresHashSet;
    public Cancion(String tituloCancion){
        this.tituloCancion= tituloCancion;
        this.autoresHashSet=new HashSet<>();
        this.artistasHashSet=new HashSet<>();
    }
    public void addArtistas(Artista a){
        this.artistasHashSet.add(a);
    }
    public void addAutores(Autor a){
        this.autoresHashSet.add(a);
    }
    public String artistasParticiparonCancion(){
        String nombres= null;
        for(Artista a:this.artistasHashSet){
            nombres = a.getNombre();
        }
        return nombres;
    }
    public String autorNacionalidadIngresadaCancion(String nacionalidadDeseada){
        String retorno = "";
        for(Autor a : this.autoresHashSet){
            if(a.getNacionalidad().equals(nacionalidadDeseada)){
                retorno = this.getTituloCancion();
            }
        }
        return  retorno;
    }
    public String getTituloCancion() {
        return tituloCancion;
    }
    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }
    public void aniadirContadorAArtista(){
        for(Artista a: this.artistasHashSet){
            a.setContadorCanciones(1);
        }
    }
    public String artistaConMas(){
        int hola = 0;
        String retorno = null;
        for (Artista a : this.artistasHashSet){
            if(a.getContadorCanciones()>hola){
                hola=a.getContadorCanciones();
                retorno=a.getNombre();
            }
        }
        return retorno;
    }
}
