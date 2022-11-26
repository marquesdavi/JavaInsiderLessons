public class App {
    public static void main(String[] args) {
        int[] array = { 3, 5, 9, 12, 52, -1, -129, 4 };
        int min = findMin(array);
        System.out.println(min);

        int[] arrayTwo = new int[3];
        arrayTwo[0] = -8;
        arrayTwo[1] = 5;
        arrayTwo[2] = 12;
        int minTwo = findMin(arrayTwo);
        System.out.println(minTwo);
    }

    static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int e : array) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }
}
