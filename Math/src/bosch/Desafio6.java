package bosch;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Agora vamos calcular o valor de Delta em uma equação quadrática.");
        int ax, bx, c;
        System.out.println("Digite o valor de A: (não é necessário digitar o quadrado)");
        ax = s.nextInt();
        System.out.println("Digite o valor de B: ");
        bx = s.nextInt();
        System.out.println("Agora digite o valor de C: ");
        c = s.nextInt();

        double delta = (Math.pow(bx,2))-4*ax*c;
        System.out.println("O Delta da sua equação é igual a: "+delta);

    }
}
