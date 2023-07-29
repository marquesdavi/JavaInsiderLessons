import java.util.Scanner;

public class StringToIntCasting {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        String numberStr = read();

        int number = Integer.parseInt(numberStr); // Transforma de String para Int
        System.out.println("Numero ao quadrado: " + (number * number));

    }
    static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
