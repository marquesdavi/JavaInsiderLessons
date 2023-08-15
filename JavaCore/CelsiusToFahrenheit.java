package JavaCore;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        var Scn = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        String fahrenheit = Scn.nextLine();

        double result = ((Double.parseDouble(fahrenheit) - 32) / 9) * 5;

        System.out.println("A temperatura de " + fahrenheit + " em Celsius é " + result);

    }
}
