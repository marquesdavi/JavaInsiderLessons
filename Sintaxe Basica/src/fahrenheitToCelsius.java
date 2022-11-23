public class fahrenheitToCelsius {
    public static void main(String[] args){
        // Em New York está fazendo 76 graus fahrenheit, e eu quero converter para celsius. Qual o resultado?
        double tF = 76;
        double tC = (tF - 32) / 9 * 5;
        System.out.println("A temperatura em C é: " + tC);
    }
}
