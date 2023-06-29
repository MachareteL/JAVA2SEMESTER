package Bosch;

public class Triangulo {
    double peri;
    double area;
    public Triangulo(double ladoDoTriangulo) {
        peri = ((ladoDoTriangulo*ladoDoTriangulo)*1.7)/4;
        area = ladoDoTriangulo*3;
    }
}
