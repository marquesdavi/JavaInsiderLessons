package javacore;

public class StringOperations {
    public static void main(String[] args){
        // Criação de Strings

        // Metodo 'new'
        String viaMetodo = new String("Nova String");
        System.out.println("Feita por método: " + viaMetodo);
        // Declaração com aspas duplas
        String strSimples = "Simples";
        System.out.println("String de declaração simples: " + strSimples);

        // Concatenação de Strings

        // Concatenação simples
        String nome = "Jubileu";
        String sobrenome = "Da Silva";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Concatenação simples: " + nomeCompleto);

        // Concatenação com o metodo .concat()
        String viaConcat = nome + " ".concat(sobrenome);
        System.out.println("Concatenação pelo metodo .concat(): " + viaConcat);

        // Operações esteticas em strings

        // Transforma a String em maiusculo
        String tudoCaixaAlta = viaConcat.toUpperCase();
        System.out.println("String em maiusculo: " + tudoCaixaAlta);

        // Transforma a String em minusculo
        String tudoCaixaBaixa = tudoCaixaAlta.toLowerCase();
        System.out.println("String em minusculo: " + tudoCaixaBaixa);

    }
}
