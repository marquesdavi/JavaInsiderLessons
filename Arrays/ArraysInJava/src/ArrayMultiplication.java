import java.util.Arrays;

public class ArrayMultiplication {
    public static void main(String[] args){
        double[] numbers = { 1.1, 3.4, 5.2, 2.8, 7.42 };
        int m = 3;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * m; // numbers na posição i recebe numbers na posição i multiplicado por m
        }
        System.out.println(Arrays.toString(numbers));
    }
}
