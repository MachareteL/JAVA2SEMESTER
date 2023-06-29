package Bosch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0, acumulador =0;
        while (contador<5){
            contador++;
            System.out.println("Digite um numero: ");
            acumulador=acumulador+s.nextInt();
            System.out.printf("Contador está em %d e acumulador está em %d\n",contador,acumulador);
        }
        acumulador=0;
        for (int i = 0; i < 5; i++) {
            contador =i;
            acumulador += i*i;
            System.out.printf("Contador está %d e acumulador está em %d\n",contador,acumulador);

        }
    }
}
