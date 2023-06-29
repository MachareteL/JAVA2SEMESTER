package Bosch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(1);
        for (int i = 1; i <= 20; i++) {
            lista.add(lista.get(i) + lista.get(i-1));
        }
        System.out.println(lista);
    }
}
