package Bosch;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = s.nextInt();
        System.out.printf("O numero digitado foi: %d",numero);

    }
}
