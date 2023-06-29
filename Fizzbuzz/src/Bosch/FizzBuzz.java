package Bosch;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        int n = s.nextInt();
        if (n % 2 == 0 & n % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (n % 5 == 0){
            System.out.println("Buzz");
        }else if (n % 2 == 0){
            System.out.println("Fizz");
        }else {
            System.out.println("ERRO");
        }
    }
}
