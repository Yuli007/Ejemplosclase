package sample;
//problema sacar el factorial de 5
//para ello se dise que para sacar el factorial de un número
// el resultado se tiene que  multiplicar dicho número por el anterior y así sucesivamente hasta llegar a uno
//por ejemplo::::::::::

//5 es 5 * 4 * 3 * 2 * 1 es = 120.

public class FactorialesNum {

    //la clase se llama factorialesnum



    int factorial(int facto) { //factorial es declarada como tipo entero (y nuevemente se reescribe


        if (facto>0) {            //facto recibe el valor 5 y num se cargará con el valor que se obtenga con el producto de facto
            // por el valor devuelto por la función factorial (llamada FactorialesNum)
            //Nuevamente se llama FactorialesNum  hasta que el parámetro facto reciba el valor 0
            //  Cuando facto recibe un cero la condición del if se valúa como falsa y ejecuta el else retornando un 1, la variable local de la llamada anterior

            int num=facto * factorial(facto-1);//numero es igual a factoial y se declara como tipo entero
                                            //y se multiplica por la factorial y facto ase la recursividad con el -1

            return num;//devuelve num
        } else   //sino
            return 1;//devuelve 1
    }

    public static void main(String[] args) {   // la función main recibe "num", en este caso el valor es 120
        FactorialesNum re=new FactorialesNum();
        int f=re.factorial(5);
        System.out.println("El factorial de 5 es "+f);
    }
}



