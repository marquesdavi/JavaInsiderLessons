public class StringManipulation {
    public static void main(String[] args){
        String nome = "eugostum".toUpperCase(); // Converte toda a String para maiúsculo
        System.out.println("Coloca 'String' em maiusculo: " + nome);

        System.out.println("Coloca 'String' para minusculo: " + nome.toLowerCase()); // Deixa toda a String em minusculo

        String dividirString = nome.substring(3); // Pula a quantidade de caracteres escolhida (Ex: 3) da esquerda para a direita
        System.out.println("Deixa a partir do indice especificado até o final: " + dividirString);

        String divideNovamente = nome.substring(1, 4);
        System.out.println("Deixa apenas o intervalo de caracteres especificado: " + divideNovamente);



    }
}
