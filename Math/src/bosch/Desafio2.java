package bosch;
import java.util.Scanner;
public class Desafio2{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Quantos Graus Celsius estão fazendo hoje?");
    double cel = s.nextDouble();
    double fah = (cel*1.8)+32;
    System.out.println(cel+" graus Celsius são: "+Math.round(fah)+" graus Fahrenheits.");
}
}