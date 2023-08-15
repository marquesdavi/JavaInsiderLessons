package JavaCore;

import java.util.Scanner;

public class StudentMean {
    public static void main(String[] args){
        var Scn = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        String n1 = Scn.nextLine();

        System.out.println("Digite a segunda nota: ");
        String n2 = Scn.nextLine();

        System.out.println("Digite a terceira nota: ");
        String n3 = Scn.nextLine();

        double result = (Double.parseDouble(n1) + Double.parseDouble(n2) + Double.parseDouble(n3)) / 3;

        System.out.println("Sua média foi " + result);
    }
}
