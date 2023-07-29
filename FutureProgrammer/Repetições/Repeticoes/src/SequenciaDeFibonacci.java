public class SequenciaDeFibonacci {
    public static void main(String[] args){
        int n = 18;
        int seq1 = 0;
        int seq2 = 1;
        System.out.println("Primeiro: " + seq1 + " Segundo: " + seq2);
        int cont = 0;

        while (cont < n) {
            int proximoDaSequencia = seq1 + seq2;
            System.out.println(proximoDaSequencia);
            seq1 = seq2;
            seq2 = proximoDaSequencia;

            cont++; 
        }
    }
}
