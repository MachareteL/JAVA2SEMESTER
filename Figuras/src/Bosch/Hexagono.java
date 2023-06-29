package Bosch;

public class Hexagono {
    double peri;
    double area;
    public Hexagono(double ladoHexa, double apot) {
        peri = ladoHexa*6;
        area = (peri*apot)/2;
    }
}
