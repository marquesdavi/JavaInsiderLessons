public class OperadoresLogicos {
    public static void main(String[] args){
        int idade = 130;
        String categoria;

        if (idade > 0 && idade <= 12){
            categoria = "CRIANÇA";
        }
        else if (idade > 12 && idade <= 18){
            categoria = "JOVEM";
        }
        else if (idade > 18 && idade <= 50){
            categoria = "ADULTO";
        }
        else if (idade > 50 && idade < 110){
            categoria = "IDOSO";
        }
        else{
            categoria = "CRIATURA MÍTICA COM MILHARES DE ANOS kkkk";
        }

        System.out.println(categoria);
    }
}
