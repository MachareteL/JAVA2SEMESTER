package Bosch;

import java.util.Scanner;

public class Converter {

    double converte(String numero){
        double convertido;
        while (true){
            try{
                convertido = Double.parseDouble(numero);
                return convertido;
            }catch (Exception e){
                System.out.print("Digite um número válido: ");
                numero = new Scanner(System.in).nextLine();
            }
        }
    }
}
