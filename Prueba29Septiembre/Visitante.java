public class Visitante {
    private int id;
    private int numeroDeAsiento;
    private int cantDeVisitas;
    public Visitante(int id,int numeroDeAsiento){
        this.id=id;
        this.numeroDeAsiento=numeroDeAsiento;
    }

    public int getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(int numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantDeVisitas() {
        return cantDeVisitas;
    }

    public void sumarCantDeVisitas() {
        this.cantDeVisitas = cantDeVisitas+1;
    }
}
