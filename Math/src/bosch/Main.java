package bosch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fah, cel;
        System.out.println("Quantos graus fahrenheits estão fazendo hoje?");
        Scanner s = new Scanner(System.in);
        fah = s.nextDouble();
        cel = (fah-32)*0.5556;
        System.out.println(fah+" graus Fahrenheits são: "+Math.round(cel)+" graus Celsius.");
    }
}
