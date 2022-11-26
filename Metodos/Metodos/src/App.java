public class App {
    public static void main(String[] args) {
        findMin();
    }

    static void findMin() {
        int[] array = { 3, 5, 9, 12 };
        int min = Integer.MAX_VALUE;

        for (int e : array) {
            if (e < min) {
                min = e;
            }
        }

        System.out.println(min);
    }
}
