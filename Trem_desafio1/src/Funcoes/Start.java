package Funcoes;

import Bosch.Main;

import java.util.Scanner;

public class Start {
    public static void pausa() throws InterruptedException {
        Thread.sleep(10);
    }
    public static void enunciado() throws InterruptedException {
        Util use = new Util();
        use.linhaB();
        System.out.println("\033[1;97m                     --Desafio do Trem v1.0 Java edition--\033[0m");
        use.linhaB();
        System.out.println("[1] Suponha que dois trens partam ao mesmo tempo de cidades diferentes, de maneira que em\n" +
                "algum momento eles irão colidir. \n[1.1] Você não pode fazer nada para impedir a tragédia, a única\n" +
                "coisa que você pode fazer é determinar o instante e o local que colidem.\n\n");
        pausa();
        System.out.println("[2] Considere que as extremidades da ferrovia vão do KM 0 até o KM 10.000\n\n");
        pausa();
        System.out.println("[3] Considere que a velocidade do trem A sempre será positiva \n[3.1] E a velocidade do tem B sempre será negativa.\n\n");
        pausa();
        System.out.println("[4] Considere que o módulo da velocidade do trem será de no máximo 300 km/h\n\n");
        pausa();
        System.out.println("[5] Seu programa terá 4 variáveis de entrada:\n" +
                "[5.a] Posição do trem A; \n[5.b] Posição do trem B;\n" +
                "[5.c] Velocidade do trem A; \n[5.d] Velocidade do trem B.\n\n");
        pausa();
        System.out.println("[6] Seu programa deve exibir após quantos\n" +
                "segundos ocorreu a colisão e em que KM\n" +
                "ocorreu a colisão.");
        entradas();
    }

    public static int valide(String num){
        while(true) {
            try {
                return Integer.parseInt(num);
            } catch (Exception e) {
                System.out.print("Digite um numero válido: ");
                num = new Scanner(System.in).nextLine();
            }
        }
    }

    public static void entradas(){
        Scanner s = new Scanner(System.in);
        System.out.print("Decida a posição inicial do 1° Trem: ");
        String posicaoTremUm = s.nextLine();
        int pos1 =  valide(posicaoTremUm);
        while (true){
            if (pos1 < 0 || pos1 >10000){
                System.out.print("A posição inicial deve ser entre o KM 0 e o KM 10.000.\nDigite novamente: ");
                posicaoTremUm = s.nextLine();
                pos1 = valide(posicaoTremUm);
                continue;

            }else{
                System.out.println("Primeira posição registrada.");
                break;
            }
        }
        System.out.print("Decida a posição inicial do 2º Trem: ");
        String posicaoTremDois = s.nextLine();
        int pos2 = valide(posicaoTremDois);
        while (true){
            if (pos2 <0 || pos2 > 10000){
                System.out.print("A posição inicial dos trens devem ser entre o Km 0 e Km 10000.\nTente novamente: ");
                posicaoTremDois = s.nextLine();
                pos2 = valide(posicaoTremDois);
                continue;
            }else{
                System.out.println("Segunda posição registrada com Sucesso");
                break;
            }
        }
        System.out.print("\n\nAgora, Vamos definir a velocidade dos trens.\nVelocidade do primeiro trem: ");
        String velocidadeTremUm = s.nextLine();
        int vel1 = valide(velocidadeTremUm);
        if (vel1 > 300){
            System.out.print("A Velocidade máxima é de 300Km/h\nDigite a Velocidade novamente: ");
            velocidadeTremUm = s.nextLine();
            vel1 = valide(velocidadeTremUm);
        }
    }
    public static void Sair(){
        System.out.println("[1]Executar Novamente\n[2]Sair");
        String sair = new Scanner(System.in).nextLine();
        int vSair = valide(sair);
        if (vSair == 1){
            new Start();

        }else if (vSair == 2){
            System.out.println("\033[0;31mSaindo...");
            System.exit(0);
        }

    }
}
