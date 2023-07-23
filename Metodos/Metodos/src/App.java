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
        int min = Integer.MAX_VALUE; // Acha o maior valor possível dentro dos inteiros

        for (int e : array) { // Percorre o array
            if (e < min) { // Verifica se a posição atual é menor que o valor de "min"
                min = e; // Se a condição for verdadeira, "min" vai receber o valor da posição atual
            }
        }
        return min;
    }
}
