public class castingDeDados {
    public static void main(String[] args){

        int a = 5 / 2; // Vai retornar um numero inteiro
        System.out.println("5 / 2 em Java é :" + a + "Porquê só retorna resultados inteiros");

        double b = 5.0 / 2; // Apenas com a simples adição de uma casa decimal, a divisão já vai funcionar normalmente
        System.out.println("Divisão de um numero 'double' por um inteiro, retorna um double. Ex: 5.0/2 " + b);

        //Também é possível explicitar o tipo de dado

        double c = (double) 5 / 2;
        System.out.println(c);

        // É possível converter um numero 'double' para 'int'
        int convA = (int) b; // Converte a variável b em inteiro
        System.out.println(convA);

    }
}
