package Bosch;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String numero = s.nextLine();
        double cNum = new Converter().converte(numero);
        Primo primo = new Primo();
        System.out.println("""
                Você deseja ver:
                [1]Números Primos Antecessores do Número Digitado.
                [2]Números Não-Primos Antecessores do Número Anterior.""");

        String ver = s.nextLine();
        double cVer = new Converter().converte(ver);

        if (primo.verifica(cNum)){
            System.out.println(cNum+" É um número Primo!");
            if (cVer == 1){
        }else{
            System.out.println(cNum+" Não é um número Primo! Ele é divisível por: "+primo.divisores);
        }

    }
}
