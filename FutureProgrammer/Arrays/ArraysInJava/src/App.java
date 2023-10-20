

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array1 = {-1, 0, 1, 2, -3, 4 ,-12};

        String[] array2 = new String[3];
        array2[1] = "tururu";

        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);

        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);
    }
}
