import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz implements ActionListener {
    JFrame ventana;
    JPanel panelSuperior;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JTextField textField;
    JLabel label;
    Interfaz(){

        ventana = new JFrame();
        ventana.setLayout(new BorderLayout());
        ventana.setSize(500,500);

        label = new JLabel("resultado");

        panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(4,1));

        boton1 = new JButton("Circulo");
        boton2 = new JButton("Esfera");
        boton3 = new JButton("Cuadrado");
        boton4 = new JButton("Cubo");


        textField = new JTextField("");

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);


        panelSuperior.add(boton1);
        panelSuperior.add(boton2);
        panelSuperior.add(boton3);
        panelSuperior.add(boton4);



        ventana.add(panelSuperior,BorderLayout.CENTER);
        ventana.add(textField,BorderLayout.NORTH);
        ventana.add(label,BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            String radio=textField.getText();
            float radio1=Float.parseFloat(radio);
            double area=Math.PI*radio1*radio1;
            label.setText(String.valueOf(area));
        }
        else if(e.getSource()==boton2){
            String radio=textField.getText();
            float radio1=Float.parseFloat(radio);
            double area=4*Math.PI*radio1*radio1;
            label.setText(String.valueOf(area));
        }
        else if(e.getSource()==boton3){
            String radio=textField.getText();
            float lado=Float.parseFloat(radio);
            double area=lado*lado;
            label.setText(String.valueOf(area));
        }
        else if(e.getSource()==boton4){
            String radio=textField.getText();
            float lado=Float.parseFloat(radio);
            double area=6*lado*lado;
            label.setText(String.valueOf(area));
        }
    }
}