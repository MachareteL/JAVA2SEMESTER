package bosch;

import javax.lang.model.type.NoType;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Toda vez que você "inicializa" uma classe se usa "NEW [CLASSE]"
        String nome; //Essa variavel nome não está inicializada (estanciada)
        nome = sc.nextLine(); //Nome está definido como sc (variavel que leva o **parametro** (system.in)
        System.out.println(nome); //Printando a variavel STRING que foi inputada pelo scanner SC

        && --> AND
        || --> OR
        ! --> NoT

    }
}
