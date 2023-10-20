package futureprogrammer.Repetições.Repeticoes.src;
public class ExSumNumbers {
    public static void main(String[] args){
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        System.out.print("A soma das iterações é: " + sum);
    }
}
