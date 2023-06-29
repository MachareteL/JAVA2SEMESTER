
public class tabuada {
    public static void main(String[] args) {
        int acumulador = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%dx%d = %d\n", acumulador,i,acumulador*i);
            if (i ==10){
                i = 0;
                acumulador +=1;
                System.out.println("\n ==''==");
            }if (acumulador == 11){
                break;
            }
        }
    }
}
