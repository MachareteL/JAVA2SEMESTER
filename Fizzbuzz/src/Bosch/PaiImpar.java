package Bosch;

import java.util.Scanner;

public class PaiImpar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele é par ou impar: ");
        int n = s.nextInt();
        if(n % 2 == 0){
            System.out.println("Seu número é par.");
        }else{
            System.out.println("Seu número é impar.");
        }
    }
}
