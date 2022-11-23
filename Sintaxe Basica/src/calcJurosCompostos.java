public class calcJurosCompostos {
    public static void main(String[] args){
        /*
         * Vamos supor que quero fazer um investimento de 120.000 reais com a corretora Rico, com um rendimento de 1% ao mês, e esse investimento vai ficar rendendo por 36 meses. Quanto vou ter no final?
         */

         // Juros compostos: Vf = Vi * (1 + J) ** t
         double vI = 120000;
         double j = 0.01;
         int t = 36;

         double vF = vI * Math.pow((1 + j), t); // A função Math.pow(x, y) é feita para calcular potenciação
         System.out.println("O valor final é: " + vF);
    }
}
