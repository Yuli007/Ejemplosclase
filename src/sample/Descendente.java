package sample;

public class Descendente {
    public Descendente() {
    }

    void imprimir(int x) {
        if (x > 0) {
            System.out.println(x);
            this.imprimir(x - 1);
        }

    }

    public static void main(String[] args) {
        Descendente re = new Descendente();
        re.imprimir(5);
    }
}


