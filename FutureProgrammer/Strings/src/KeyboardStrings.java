package futureprogrammer.Strings.src;
import java.util.Scanner;

public class KeyboardStrings {
    public static void main(String[] args) {
        System.out.println("Você digitou: " + read());
    }
    static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
