public class NumPrimo {
    public static void main(String[] args){
        int n = 7;
        boolean isPrime = true;

        if (n == 0 || n == 1){
            isPrime = false;
        }
        else {
            for (int i = 2; i < n; i++){
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println("O numero " + n + " é primo!" + isPrime);



        /* 
        if (n % 1 == 0 || n % n == 0){
            System.out.println("O numero " + n + " é primo.");
        }
        else {
            System.out.println("O numero " + n + " não é primo.");
        }
        */
    }
}
