package Bosch;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] meuArray = new int[5];

        System.out.println(meuArray);
        System.out.println(Arrays.toString(meuArray));


        ArrayList<Usuario> users = new ArrayList<>();
        Usuario u1 = new Usuario("Joao", 18);
        users.add(u1);
        System.out.println(users.get(0)); //.nome usado para acessar o nome dentro do local da memoria

        System.out.println(users.get(0).nome); //.nome usado para acessar o nome dentro do local da memoria

        for (Usuario usuario:
             users) {
            System.out.println(usuario.nome);
        }

        // iniciando uma arrayList com argumentos armazenados

        ArrayList<String> usuarios = new ArrayList<>(Arrays.asList("Nomes", "nomes2"));

    }
}
