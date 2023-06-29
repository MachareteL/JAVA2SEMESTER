package Bosch;


public class Main {

    public static void main(String[] args) {
        double nota = 7.1;
        int presença = 90;
        boolean postura = true;
        String situacao;
        if (nota >= 5.0 && presença >= 75 && postura == true){
            situacao = "Aprovado";
        }else if (nota <5.0 && presença >=75 && postura == true){
            situacao = "Recuperação";
        }else if (nota>=5.0 && presença <75 && postura == true){
            situacao = "Sem Férias";
        }else if (nota>=5.0 && presença >=75 && postura !=true /* TODO PODE USAR !postura NO LUGAR DE !=true*/){
            situacao = "Conversa";
        }else{
            situacao = "Reprovado";
        }

    }
}
