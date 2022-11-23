import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 9, 5, 8, 12, 10, 1 };
        System.out.println(Arrays.toString(array));

        // Bubble Sort

        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
