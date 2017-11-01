package sample;

public class Impares {
    public Impares() {
    }

    public static int impar(int x) {
        System.out.println("entre a impar y la x vale :" + x);
        return x == 1 ? 1 : impar(x - 1) + 2;
    }

    public static void main(String[] args) {
        int resultado = impar(8);
        System.out.println("El termino :8de la serie es:" + resultado);
    }
}


