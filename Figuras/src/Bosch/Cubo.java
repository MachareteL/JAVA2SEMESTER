package Bosch;

public class Cubo {
    double area;
    double volume;
    public Cubo(double ladoQuadrado) {
        area = (ladoQuadrado*2)*6;
        volume = Math.pow(ladoQuadrado, 3);
    }
}
