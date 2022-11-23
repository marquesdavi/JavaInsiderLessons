import java.net.http.HttpResponse.ResponseInfo;

public class Variaveis {
    public static void main(String[] args) {

        
        double numero = 10.65; 
        // Variável do tipo double só recebe valores com casa decimal(1.2, 36.5, 9.8)
        System.out.println(numero);

        int numeroInt = 50;
        // A variável do tipo 'int' só recebe números inteiros
        System.out.println(numeroInt);

        boolean verdadeOuMentira = false;
        // A variavel do tipo 'boolean' só recebe dados to tipo verdadeiro/falso (true/false)
        System.out.println("Verdade ou mentira? " + verdadeOuMentira);

        String nomeDoAluno = "Lucas Gabriel";
        // A variável do tipo 'String' só recebe dados do tipo texto
        System.out.println("Nome do aluno: " + nomeDoAluno);


        /*
        double nota1, nota2, nota3, resultado;

        nota1 = 10;
        nota2 = 8.2;
        nota3 = 3.8;

        resultado = (nota1 + nota2 + nota3) / 3;

        if (resultado >= 7) {
            System.out.println("Você foi aprovado com a média " + resultado);
        }
        else {
            System.out.println("Você foi reprovado com média " + resultado);
        }
         */

    }
}
