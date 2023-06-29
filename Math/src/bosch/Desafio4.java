package bosch;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Agora, Digite um valor: ");
        double valor = s.nextDouble();
        double sqr = Math.pow(valor,2);
        double cb = Math.pow(valor,3);
        System.out.println("O quadrado de "+valor+" é: "+sqr+" e "+valor+" ao cubo é: "+cb);
    }
}
