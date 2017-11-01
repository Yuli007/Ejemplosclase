package sample;

public class numeros {
    public numeros() {
    }

    public static void main(String[] args) {
        int n = 5;
        int resultado = sumarecur(n);
        System.out.println(resultado);
    }

    public static int sumarecur(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            int result = numero + sumarecur(numero - 1);
            return result;
        }
    }
}


