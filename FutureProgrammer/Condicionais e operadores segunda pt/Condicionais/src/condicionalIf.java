public class condicionalIf {
    public static void main(String[] args){
        int idadePessoaA = 19;
        int idadePessoaB = 18;

        if (idadePessoaA > idadePessoaB){
            System.out.println("A pessoa A é mais velha que a pessoa B.");
        }
        else if (idadePessoaA < idadePessoaB){
            System.out.println("A pessoa B é mais velha que a pessoa A.");
        }
        else {
            System.out.println("A pessoa A e a pessoa B são da mesma idade.");
        }
    }
}
