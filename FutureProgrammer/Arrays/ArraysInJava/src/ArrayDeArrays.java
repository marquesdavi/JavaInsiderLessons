public class ArrayDeArrays {
    public static void main(String[] args){
        
        String[] [] matriz = { // O conteúdo do array que fica por fora indica a quantidade de linhas
            {"Davi", "Gabriel", "Lucas"}, // Os conteúdo dos arrays que ficam dentro do outro, indica as colunas
            {"Isaías", "Isabel", "Margarete"} 
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
