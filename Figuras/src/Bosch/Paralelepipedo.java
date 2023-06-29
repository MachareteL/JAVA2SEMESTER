package Bosch;

public class Paralelepipedo {
    double volume;
    double area;
    Paralelepipedo ( double base, double profundidade, double altura){
        area = (base*altura)*6;
        volume = base*altura*profundidade;
    }

}