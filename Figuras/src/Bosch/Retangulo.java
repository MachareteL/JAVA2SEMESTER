package Bosch;

public class Retangulo {
    double peri;
    double area;
    public Retangulo(double ladoMaior, double ladoMenor) {
        peri = (ladoMaior*2)+(ladoMenor*2);
        area = ladoMaior*ladoMenor;
    }
}
