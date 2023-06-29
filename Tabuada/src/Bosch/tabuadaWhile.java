package Bosch;

public class tabuadaWhile {
    public static void main(String[] args) {
        int i = 0, tabuada = 0;

        while (tabuada != 10){
            tabuada+=1;
            System.out.printf("%d x %d = %d\n",tabuada,i,tabuada*i);
            if (i == 11){
                break;
            }
            else if (tabuada==10){
                System.out.println("--===-- ' ' --===--");
                i+=1;
                tabuada = 0;
            }
        }
    }
}
