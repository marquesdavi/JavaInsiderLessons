import java.util.Arrays;

public class ArrayInvert {
    public static void main(String[] args) {
        String[] a = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
        String[] b = new String[a.length];

        for (int i = a.length - 1; i >= 0; i--){ 
            b[a.length - 1 - i] = a[i];
        }
        System.out.println("Array inicial \n" + Arrays.toString(a));
        System.out.println("Array invertido \n" + Arrays.toString(b));
    }
}
