import java.util.HashMap;
public class Pedidos {
    private String fechaDeCreacion;
    private persona personaQuePidio;
    private Platos platoQuePidio;
    private int horaEntrega;
    private boolean entregado;
    public Pedidos(String fechaCreacion1,int horaEntrega1,boolean entregado1,persona a,Platos b){
        this.fechaDeCreacion=fechaCreacion1;
        this.horaEntrega=horaEntrega1;
        this.entregado=entregado1;
        this.personaQuePidio=a;
        this.platoQuePidio=b;
    }
    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }
    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    public int getHoraEntrega() {
        return horaEntrega;
    }
    public void setHoraEntrega(int horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    public boolean isEntregado() {
        return entregado;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Platos getPlatoQuePidio() {
        return platoQuePidio;
    }

    public void setPlatoQuePidio(Platos platoQuePidio) {
        this.platoQuePidio = platoQuePidio;
    }

    public persona getPersonaQuePidio() {
        return personaQuePidio;
    }

    public void setPersonaQuePidio(persona personaQuePidio) {
        this.personaQuePidio = personaQuePidio;
    }
}