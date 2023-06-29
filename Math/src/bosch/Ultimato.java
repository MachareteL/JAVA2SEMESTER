package bosch;

public class Ultimato {
    public static void main(String[] args) {
//        double linha = Math.pow((3*((Math.pow(-3,-2))/(Math.pow(4,-2))+(6*((Math.pow(3,-1))/4))-4))/(7*(Math.pow(-3,-1)/Math.pow(4,-1)+2)),-1)+4;
        double linha = Math.pow((3*((Math.pow(-3,-2))/(Math.pow(4,-2)))+(6*((Math.pow(3,-1)/4))-4))/(7*((Math.pow(-3,-1))/(Math.pow(4,-1)))+2),-1)+4;
        System.out.println(linha);
        System.out.println(" ");
        //
        // (-3/4)^-2  ==  -3^-2/4


        double p1 = 3*((Math.pow(-3,-2))/(Math.pow(4,-2)));
        double p2 = 6*((Math.pow(3,-1))/4)-4;
        double p3 = 7*((Math.pow(-3,-1))/(Math.pow(4,-1)))+2;
        double resultado = (Math.pow((p1+p2)/p3,-1))+4;
        System.out.println(resultado);

    }
}
