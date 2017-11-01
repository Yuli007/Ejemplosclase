package sample;
import java.util.Scanner; //metodo de lectura

public class Principal {
    //es una clase publica llamada principal

    public Principal() {
    }

    public static void main(String[] args) { //puede ser una clase publica , static un método puede ser de instancia o de clase ,
        //void  que los métodos pueden devolver algo,
        Scanner sc = new Scanner(System.in);   //metodo de lectura

        int numero;                              //una variable numero declarada como tipo entero
        do {                            //do es una sentencia do-while es de tipo posprueba es que  Primero realiza las acciones luego pregunta
            System.out.print("Escribe  un numero entero mayor a 0 ");//manda a imprimir en pantalla
            numero = sc.nextInt();        //recibe el numero ingresado por el usuario y lo lo lee
        } while(numero <= 0);          // es una sentencia do-while es de tipo posprueba es que  Primero realiza las acciones luego pregunta
        // es decir mientras  numero sea  menor o igual a 0 sera veraddadero

        System.out.println("La suma desde 1 hasta " + numero + " = " + sumauno(numero)); //manda a imprimir y concatena es decir manda a traer el numero y ase la operacion suma
        //sumauno dentro de numero
    }

    public static double sumauno(int n) {                                  //sumauno esta declarada como tipo doouble y la variable n esta declarada como tipop entero
        return n == 1 ? 1.0D : (double)n + sumauno(n - 1);            //devuelve n que es igual a 1 , suma sumauno y la varibale n ase la recursividad resatandolole -1
    }
}


