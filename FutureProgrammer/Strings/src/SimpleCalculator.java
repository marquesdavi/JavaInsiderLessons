import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.print("Primeiro número: ");
        double n1 = Double.parseDouble(read());
        System.out.print("Segundo número: ");
        double n2 = Double.parseDouble(read());

        System.out.print("Operação(+,-,*,/): ");
        String op = read();

        double result;
        if (op.equals("+")) {
            result = n1 + n2;
            System.out.println("O resultado das operações é: " + result);
        }
        else if (op.equals("-")) {
            result = n1 - n2;
            System.out.println("O resultado das operações é: " + result);
        }
        else if (op.equals("*")) {
            result = n1 * n2;
            System.out.println("O resultado das operações é: " + result);
        }
        else if (op.equals("/")) {
            result = n1 / n2;
            System.out.println("O resultado das operações é: " + result);
        }
        else System.out.println("Operação inválida! ");


    }
    static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
