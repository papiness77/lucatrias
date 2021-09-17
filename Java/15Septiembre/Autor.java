[13:26] TRIAS LUPINACCI Luca Gonzalo
    

public class Autor extends Persona{​​​​​​​​
    private String nacionalidad;
    public Autor(String nombre, String apellido, String fechaDeNacimiento, String nacionalidad){​​​​​​​​
        super(nombre,apellido,fechaDeNacimiento);
        this.nacionalidad=nacionalidad;
    }​​​​​​​​
    public String getNacionalidad() {​​​​​​​​
        return nacionalidad;
    }​​​​​​​​
    public void setNacionalidad(String nacionalidad) {​​​​​​​​
        this.nacionalidad = nacionalidad;
    }​​​​​​​​
}​​​​​​​​


