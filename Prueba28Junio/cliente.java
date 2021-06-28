public class cliente extends persona {
    private int cbu;
    public cliente(String nombre, int dni,int cbu) {
        super(nombre, dni);
        this.cbu=cbu;
    }
    public int getCbu() {
        return cbu;
    }
    public void setCbu(int cbu) {
        this.cbu = cbu;
    }
}
