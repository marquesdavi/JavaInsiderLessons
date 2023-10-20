package javacore;

public class KeyboardInput {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        String noteA = scanner.nextLine();

        System.out.println("Digite a segunda nota: ");
        String noteB = scanner.nextLine();

        System.out.println("Digite a terceira nota: ");
        String noteC = scanner.nextLine();

        double result;
        result = (
                Double.parseDouble(noteA) +
                Double.parseDouble(noteB) +
                Double.parseDouble(noteC)) / 3;

        if (result >= 7){
            System.out.println("Você foi aprovado com média: " + result);
        }
        else{
            System.out.println("Você foi reprovado com média: " + result);
        }
    }
}
