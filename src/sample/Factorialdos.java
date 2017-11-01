package sample;

public class Factorialdos {
    public static double factorial (int num){
        if (num<=1 )//caso base
            return 1;
        else
            return  num*factorial(num-1);//parte recursiva

    }
    public static void main (String args [] ){
        System.out.println("Valor\tfactorial");
        for (int x=1; x<=5; x++)
            System.out.printf("%d\t\t%.0f\n",x,factorial(x));
    }

}
