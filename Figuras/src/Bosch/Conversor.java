package Bosch;

import java.util.Scanner;

public class Conversor {

    int converter(String numeroParaConverter){
        Scanner s = new Scanner(System.in);
        while (true){
            try {
                Integer numConvertido = Integer.parseInt(numeroParaConverter);
                if (numConvertido > 0){
                    return numConvertido;
                }
                else {
                    throw new Exception();
                }
            }
            catch (Exception e){
                System.out.print("Escolha um número válido: ");
                numeroParaConverter = s.nextLine();
            }
        }
    }
}
