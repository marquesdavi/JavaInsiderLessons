package JavaCore;

public class VariableRepresentation {
    public static void main(String[] args) {
        long a = 20_000_000_000L; // Números do tipo long devem ter um "L" no final para indicar o tipo
        System.out.println("Long: " + a);
        int binario = 0b1010; // Retorna 10
        System.out.println("Binário: " + binario);
        int hexadecimal = 0x12AF_2020; // Forma de inserir numeros hexadecimais em uma variavel int
        System.out.println("Hexadecimal: " + hexadecimal);
        int octal = 0423;
        System.out.println("Numero octal: " + octal);
    }
}
