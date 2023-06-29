package Bosch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conversor c = new Conversor();
        Scanner s = new Scanner(System.in);
        int type;
        int figu;
        String[] planas = {"Quadrado", "Circulo", "Triangulo", "Retangulo", "Hexagono Regular"};
        String[] espaciais = {"Cubo", "Paralelepido", "Piramide de base quadrada", "Esfera", "Cilindro", "Cone"};
        System.out.print("""
                Bem vindo à Calculadora automática de figuras planas v2.0
                Aqui calculamos figuras:
                [1]Planas
                [2]Espaciais
                Escolha o tipo de Figura que deseja calcular:\s""");
        String typ = s.nextLine();
        while (true) {
            type = c.converter(typ);
            if (0 < type && 3 > type) {
                break;
            } else {
                System.out.print("Escolha uma opção válida: ");
                typ = s.nextLine();
            }
        }
        if (type == 1) {
            System.out.println("As figuras planas disponíveis são:");
            for (int i = 0; i < planas.length; i++) {
                System.out.printf("[%d]" + planas[i] + "\n", i + 1);
            }
            System.out.println("Digite a figura que deseja calcular: ");
            String fig = s.nextLine();

            while (true) {
                figu = c.converter(fig);
                if (figu <= (planas.length) && figu > 0) {
                    switch (figu) {
                        case 1:
                            System.out.print("Digite o lado do seu quadrado em cm: ");
                            double quadrado = s.nextDouble();
                            Quadrado q = new Quadrado(quadrado);
                            System.out.printf("O quadrado de lado %.2f cm possui:\nPerimetro: %.2f cm\nArea: %.2f cm2"
                                    , quadrado, q.perimetro, q.area);
                            break;
                        case 2:
                            System.out.print("Digite o raio do circulo em cm: ");
                            double circulo = s.nextDouble();
                            Circulo cir = new Circulo(circulo);
                            System.out.printf("O circulo de raio %.2f cm possui:\nCircunferencia: %.2f cm\nArea: %.2f cm2"
                                    , circulo, cir.circu, cir.area);
                            break;
                        case 3:
                            System.out.print("Digite o lado do seu triangulo equilatero em cm: ");
                            double triangulo = s.nextDouble();
                            Triangulo t = new Triangulo(triangulo);
                            System.out.printf("O quadrado de lado %.2f cm possui:\nPerimetro: %.2f cm\nArea: %.2f cm2"
                                    , triangulo, t.peri, t.area);
                            break;
                        case 4:
                            System.out.print("Digite o Maior lado do seu retangulo em cm: ");
                            double ladoMa = s.nextDouble();
                            System.out.print("Digite o Menor lado do seu retangulo em cm: ");
                            double ladoMe = s.nextDouble();

                            Retangulo r = new Retangulo(ladoMa, ladoMe);
                            System.out.printf("O Retangulo de lados %.2fcm e %.2fcm possui:\nPerimetro: %.2f cm\nArea: %.2f cm2"
                                    , ladoMa, ladoMe, r.peri, r.area);
                            break;

                        case 5:
                            System.out.print("Digite o lado do seu Hexagono em cm: ");
                            double hexa = s.nextDouble();
                            System.out.print("Digite a Apotema do seu Hexagono em cm: ");
                            double apo = s.nextDouble();

                            Hexagono h = new Hexagono(hexa, apo);
                            System.out.printf("O Hexagono de lado %.2fcm e apotema %.2fcm possui:\nPerimetro: %.2f cm\nArea: %.2f cm2"
                                    , hexa, apo, h.peri, h.area);
                            break;

                    }
                    break;
                } else {
                    System.out.println("Digite uma opção válida: ");
                    fig = s.nextLine();
                }
            }
        } else {
            System.out.println("As figuras espaciais disponíveis são:");
            for (int i = 0; i < espaciais.length; i++) {
                System.out.printf("[%d]" + espaciais[i] + "\n", i + 1);
            }
            System.out.println("Digite a figura que deseja calcular: ");
            String fig = s.nextLine();

            while (true) {
                figu = c.converter(fig);
                if (figu <= (espaciais.length) && figu > 0) {
                    switch (figu) {
                        case 1:
                            System.out.print("Digite o valor da aresta do seu cubo em cm: ");
                            double cubo = s.nextDouble();
                            Cubo cub = new Cubo(cubo);
                            System.out.printf("O Cubo de lado %.2f cm possui:\nArea: %.2f cm\nVolume: %.2f cm2"
                                    , cubo, cub.area, cub.volume);
                            break;
                        case 2:
                            System.out.print("Digite o valor da base do paralelepipedo em cm: ");
                            double pbase = s.nextDouble();
                            System.out.print("Digite o valor da profundidade do paralelepipedo em cm: ");
                            double pprof = s.nextDouble();
                            System.out.print("Digite o valor da altura do paralelepipedo em cm: ");
                            double phei = s.nextDouble();
                            Paralelepipedo par = new Paralelepipedo(pbase, pprof, phei);
                            System.out.printf("O Paralelpiperdo de base %.2f cm, altura %.2fcm e profundidade %.2f possui:\nArea: %.2f\n Volume: %.2f",pbase, phei, pprof, par.area,par.volume);
                            break;
                        case 3:
                            System.out.print("Digite o lado do seu triangulo equilatero em cm: ");
                            double triangulo = s.nextDouble();
                            Triangulo t = new Triangulo(triangulo);
                            System.out.printf("O quadrado de lado %.2f cm possui:\nPerimetro: %.2f cm\nArea: %.2f cm2"
                                    , triangulo, t.peri, t.area);
                            break;
                        case 4:
                            System.out.print("Digite o Maior lado do seu retangulo em cm: ");
                            double ladoMa = s.nextDouble();
                            System.out.print("Digite o Menor lado do seu retangulo em cm: ");
                            double ladoMe = s.nextDouble();

                            Retangulo r = new Retangulo(ladoMa, ladoMe);
                            System.out.printf("O Retangulo de lados %.2fcm e %.2fcm possui:\nPerimetro: %.2f cm\nArea: %.2f cm2"
                                    , ladoMa, ladoMe, r.peri, r.area);
                            break;

                        case 5:
                            System.out.print("Digite o lado do seu Hexagono em cm: ");
                            double hexa = s.nextDouble();
                            System.out.print("Digite a Apotema do seu Hexagono em cm: ");
                            double apo = s.nextDouble();

                            Hexagono h = new Hexagono(hexa, apo);
                            System.out.printf("O Hexagono de lado %.2fcm e apotema %.2fcm possui:\nPerimetro: %.2f cm\nArea: %.2f cm2"
                                    , hexa, apo, h.peri, h.area);
                            break;
                    }

                } else {
                    System.out.println("Digite uma opção válida: ");
                    fig = s.nextLine();
                }
            }
        }
    }
}
