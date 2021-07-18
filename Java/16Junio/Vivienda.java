import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Vivienda {
    private static float TARIFA_VIVIENDA = 2;
    protected ArrayList<Duenio> ArrayDuenio;
    private String Direccion;
    protected HashMap<String, Float> HashConsumo;

    public Vivienda(String Direccion) {
        this.Direccion = Direccion;
        this.ArrayDuenio = new ArrayList<>();
        this.HashConsumo = new HashMap<>();
    }

    public void AgregarDuenio(Duenio a, String nombrea, int edada, int dnia) {
        a.setDuenio(nombrea, edada, dnia);
        this.ArrayDuenio.add(a);
    }

    public void CargarConsumo(int mesesquequiereagregar) {
        for (int i = 0; i < mesesquequiereagregar; i++) {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Nombre del mes que quiere agregar");
            String mesaagregar = scanner1.nextLine();
            System.out.println("Cuante energia gasto en ese mes?");
            float energiagastada = scanner2.nextFloat();
            boolean bool;
            bool = false;
            for (String z : HashConsumo.keySet()) {
                if (z.equals(mesaagregar)) {
                    bool = true;
                    System.out.println("Este mes ya ha sido usado");
                    System.out.println("Se le ha sido dada otra chance para ingresar el mes");
                    mesesquequiereagregar++;
                }
            }
            if (!bool) {
                HashConsumo.put(mesaagregar, energiagastada);
            }
        }
    }

        public void CalcularConsumo () {
            float consumoelectricidad;
            for (String i : HashConsumo.keySet()) {
                consumoelectricidad = HashConsumo.get(i);
                float montoapagar = consumoelectricidad * TARIFA_VIVIENDA;
                System.out.println("En el mes de" + i + "tendra que pagar" + montoapagar);
            }
        }
    }
