package Bosch;

public class Piramide {
    double area;
    double volume;
    Piramide(double areaBase, double facesLaterais, double altura){
        volume = (areaBase * altura)/3;
        area = areaBase + facesLaterais;

    }



}
