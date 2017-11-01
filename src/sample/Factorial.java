package sample;

public class Factorial {
    public static double factorial (int num ){
        double f=1;
        for ( int i=1; i<=num; i++)
            f*=i;
        return  f;

    }
    public  static  void  main (String [] args){
        System.out.println("valor\tFactorial");
        for (int x=1; x<=5; x++)
        System.out.printf("%d\t\t%.0f\n",x,factorial(x));

    }
}
