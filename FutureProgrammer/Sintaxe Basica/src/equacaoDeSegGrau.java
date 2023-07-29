public class equacaoDeSegGrau {
    public static void main(String[] args){

        int a = 4;
        int b = 6;
        int c = -3;

        double delta = b * b - 4 * a * c;

        // A função Math.sqrt(x) calcula a raiz quadrada(sqrt == Square Root) do numero determinado.

        double x1 = (-b + Math.sqrt(delta)) / (2 * a); 

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("O Valor de Delta é: " + delta);
        System.out.println("A raiz positiva de Delta é: " + x1);
        System.out.println("A raiz negativa de Delta é: " + x2);

    }
}
