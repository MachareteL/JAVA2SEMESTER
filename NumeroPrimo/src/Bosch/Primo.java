package Bosch;

import java.util.ArrayList;

public class Primo {

    ArrayList<Integer> divisores = new ArrayList<>();

    public boolean verifica(double numero){

        for (int i = 2; i <= numero ; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
            if (i == numero){

                return false;
            }
        }
        return true;
    }
}
