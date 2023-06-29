package Bosch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random bound = new Random();
        ArrayList<String> alunos = new ArrayList<>(Arrays.asList("Adhayne", "Tejero", "Beatriz", "Guilherme", "Lucas",
                "Tayssa", "Grazielly", "Luiza", "Emilly", "Naely", "Raissa", "Radija", "Capovila", "Livia", "Gabriel",
                "Gustavo", "Alex", "Michael"));
        if (alunos.size() % 2 == 0){
            for (int i = 0; i < alunos.size(); i++) {
                alunos.remove(bound.nextInt(alunos.size()));
            }
        }else{
            for (int i = 0; i < alunos.size() + 1; i++) {
                alunos.remove(bound.nextInt(alunos.size()));
            }
        }
        System.out.println(alunos);

    }
}
