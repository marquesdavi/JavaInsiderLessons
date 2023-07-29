public class App {
    public static void main(String[] args){
        int min = 10;
        int max = 100;
        
        /*A primeira parte cria a variavel para iteração, a segunda checa a condição e a terceira
        parte incrementa/decrementa*/
        for (int i = min; i <= max; i++){ 
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
