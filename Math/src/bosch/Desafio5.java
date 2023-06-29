package bosch;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Agora vamos calcular a area de um triangulo!");
        System.out.println("Digite o valor da base do seu triangulo: ");
        double base = s.nextDouble();
        System.out.println("Agora digite o valor da altura do seu triangulo: ");
        double h = s.nextDouble();
        double bh = (base*h)/2;
        System.out.println("A area do seu triangulo é igual a: "+bh);
    }
}
