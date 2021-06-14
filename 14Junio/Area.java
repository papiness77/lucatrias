import static java.lang.Math.PI;

public class Area {
    public static double circulo(double radio1){
        radio1 = PI*radio1*radio1;
        return radio1;
    }
    public static double esfera(double radio1){
        radio1 = 4*PI*radio1*radio1;
        return radio1;
    }
    public static double cuadrado(double lado1){
        lado1 = lado1*lado1;
        return lado1;
    }
    public static double cubo(double lado1){
        lado1 = 6*lado1*lado1;
        return lado1;
    }
    public static double triangulo(double base, double altura){
        base = (base*altura)/2;
        return base;
    }

}