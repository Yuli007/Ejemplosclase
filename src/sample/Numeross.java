package sample;

public class Numeross {
    void imprimir(int x) { //x  es un parametro
        if (x>0) {   //Cuando x vale 0 la condición del if se valúa como falsa y sale de la función imprimir.

            // la condición del if se valúa como verdadero por lo que entra al bloque y llama recursivamente a la función imprimir pasándole el valor 3 al parámetro
            imprimir(x-1);//Nuevamente la condición se valúa como verdadero y llama a la función enviándole un 2, lo mismo ocurre cuando le envía un 1 y un 0
            //cuando imprime   1 finaliza la ejecución de la función

            System.out.println(x);// función imprimir
        }
    }


    //En la primera llamada desde la función main el parámetro x recibe el valor 5.
    // Cuando llamamos desde la misma función le enviamos el valor de x menos 1 y la memoria queda de la siguiente forma.....
    //5
    //4





    public static void main(String[] args) { //
        Numeross re=new Numeross();
        re.imprimir(10);//va a imprimir hasta el numero 10
    }
}

