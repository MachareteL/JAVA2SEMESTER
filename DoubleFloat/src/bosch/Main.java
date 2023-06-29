package bosch;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
//        Tipos de variaveis
        byte meu_byte = 127;
        System.out.printf("Tamanho do Byte: %d\n",meu_byte);
        short meu_short = 32767;
        System.out.println("Tamanho do Short: "+meu_short);
        int meu_int = 2_147_483_647;
        System.out.printf("Tamanho do int: %d",meu_int);
        long meu_long = 9_223_372_036_854_775_807L;
        System.out.printf("\nTamanho do long: %d",meu_long);

//        Variavel tipo Real
        float meuFloat = 3.1234F;
        System.out.printf("\nValor do Float: %f",meuFloat);
        double meuDouble = 1.1234567890;
        System.out.printf("\nValor do Double:? %f",meuDouble);
//        Variavel char
        char meuChar = 'A';
        System.out.printf("\nMeu caracter é: %c",meuChar);
//        Variavel boolean
        boolean meuBoolean = true;
        System.out.printf("\nMeu booleano é: %b",meuBoolean);
//        Classe/Objeto String
        String minhaString = "Que amanhã eu seja melhor do que hoje, que hoje eu seja melhor que ontem!";
        System.out.printf("\nA frase da semana é: \n%s",minhaString);
    }
}
