package Funcoes;

import java.util.Scanner;

public class Start {
    public static void pausa() throws InterruptedException {
        Thread.sleep(10);
    }
    public static void enunciado() throws InterruptedException {
        System.out.println("Suponha que dois trens partam ao mesmo tempo de cidades diferentes, de maneira que em\n" +
                "algum momento eles irão colidir. Você não pode fazer nada para impedir a tragédia, a única\n" +
                "coisa que você pode fazer é determinar o instante e o local que colidem.\n\n");
        pausa();
        System.out.println("Considere que as extremidades da ferrovia\n" +
                "vão do KM 0 até o KM 10.000\n\n");
        pausa();
        System.out.println("Considere que a velocidade do trem A sempre\n" +
                "será positiva e a velocidade do tem B sempre\n" +
                "será negativa.\n\n");
        pausa();
        System.out.println("Considere que o módulo da velocidade do\n" +
                "trem será de no máximo 300 km/h\n\n");
        pausa();
        System.out.println("Seu programa terá 4 variáveis de entrada:\n" +
                "posição do trem A, posição do trem B,\n" +
                "velocidade do trem A e velocidade do trem B.\n\n");
        pausa();
        System.out.println("Seu programa deve exibir após quantos\n" +
                "segundos ocorreu a colisão e em que KM\n" +
                "ocorreu a colisão.");
        entradas();
    }
    public static void entradas(){
        Scanner s = new Scanner(System.in);
        System.out.println("Decida a posição inicial do 1° Trem: ");
        String posicaoTremUm = s.nextLine();
        int x;
        try{
            x = Integer.parseInt(posicaoTremUm);
        }catch (Exception e){
            System.out.println("Digite um numero válido para a posição: ");
            posicaoTremUm = s.nextLine();
        }
    }
}
