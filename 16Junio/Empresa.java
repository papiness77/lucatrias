import java.util.ArrayList;
import java.util.HashMap;

public class Empresa extends Vivienda {
    private static float TARIFA_EMPRESA= 3;
    private String RazonSocial;

    public Empresa(String Direccion,String RazonSocial){
        super(Direccion);
        super.ArrayDuenio = new ArrayList<>();
        super.HashConsumo = new HashMap<>();
        this.RazonSocial=RazonSocial;
    }

    @Override
    public void AgregarDuenio(Duenio a, String nombrea, int edada, int dnia) {
        super.AgregarDuenio(a, nombrea, edada, dnia);
    }

    @Override
    public void CargarConsumo(int mesesquequiereagregar) {
        super.CargarConsumo(mesesquequiereagregar);
    }
    public void CalcularConsumo1(){
        float consumoelectricidad;
        for(String i : HashConsumo.keySet()){
            consumoelectricidad=HashConsumo.get(i);
            float montoapagar = consumoelectricidad*TARIFA_EMPRESA;
            System.out.println("En el mes de"+i+"tendra que pagar"+montoapagar);
        }
    }
}
