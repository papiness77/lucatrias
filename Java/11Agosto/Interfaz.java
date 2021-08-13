import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;

public class Interfaz {
    public static void main(String[] args) {
        HashMap<String,Float> hashProductos = new HashMap<>();

        hashProductos.put("banana",1f);
        hashProductos.put("manzana", 2f);
        hashProductos.put("naranja", 3f);
        hashProductos.put("granada", 4f);
        hashProductos.put("jengibre",3f);
        hashProductos.put("durazno",5f);

        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel texto = new JLabel("ingrese un producto:");
        texto.setBounds(25,25,300,25);

        JTextField campoDeTexto = new JTextField();
        campoDeTexto.setBounds(25,60,500,25);

        JButton boton = new JButton("Precio");
        boton.setBounds(25,100,100,33);

        JLabel respuesta = new JLabel();
        respuesta.setSize(500,25);
        respuesta.setLocation(30,150);

        ventana.add(texto);
        ventana.add(campoDeTexto);
        ventana.add(boton);
        ventana.add(respuesta);

        ventana.setVisible(true);

        boton.addMouseListener(
                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String texto="";
                        String b ="";
                        for(String a: hashProductos.keySet()){
                            b=campoDeTexto.getText();
                            if(b.toLowerCase().equals(a)){
                                texto = "¡El precio de " + a + " es de: "+ "€" + hashProductos.get(a);
                                break;
                            }
                            else{
                                texto = "no tenemos ese producto";
                            }
                        }


                        respuesta.setText(texto);
                    }
                });
    }
}