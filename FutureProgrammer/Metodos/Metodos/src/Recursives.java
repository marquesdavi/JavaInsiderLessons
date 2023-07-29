public class Recursives {
    public static void main(String[] args){
        System.out.println("Fatorial: " + factor(50));
    }

    static int factor(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factor(n - 1); // Metodos recursivos chamam a sí proprios dentro do corpo
    }
}
