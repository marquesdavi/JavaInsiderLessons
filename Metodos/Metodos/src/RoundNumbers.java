import java.util.Arrays;

public class RoundNumbers {
    public static void main(String[] args) {
        double [] teste = new double[5];
        teste[0] = 10.6;
        teste[1] = 6.9;
        teste[2] = 90.8954;
        teste[3] = 456.32;
        teste[4] = 213.065;
        System.out.println(Arrays.toString(roundA(teste)));
    }
    
    static int[] roundA(double[] numbers) {

        int[] roundedNumbers = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            roundedNumbers[i] = (int) numbers[i];
        }
        return roundedNumbers;
    }
}
