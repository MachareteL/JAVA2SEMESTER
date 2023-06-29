package bosch;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantos kilos você pesa?");
        double peso = s.nextDouble();
        System.out.println("Quantos metros você mede?");
        double h = s.nextDouble();
        double imc = peso/(Math.pow(h,2));
        System.out.println("Seu IMC é: "+imc);
    }
}
