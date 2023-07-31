package JavaCore;

public class ImplicitCasting {
    public static void main(String[] args) {
        // Casting IMPLICITO

        // Uma variavel do tipo byte recebe apenas 1 numero
        byte umByte = 1;
        // Uma variável do tipo "short" pode receber uma do tipo "byte"
        short recebeByte = umByte;
        // Uma variável do tipo "int" pode receber uma variável do tipo "short"
        int recebeShort = recebeByte;
        // Uma variável do tipo "long" pode receber uma variável do tipo "int"
        long recebeInt = recebeShort;
        // Uma variável do tipo "float" pode receber uma variável do tipo "long"
        float recebeLong = recebeInt;
        // E uma variável do tipo "double" pode receber uma variável do tipo "float"
        double recebeFloat = recebeLong;

        System.out.println("""
                No final, a variável 'recebeFloat',
                que é do tipo 'double', vai receber o
                mesmo valor disposto na variável \n do tipo 'byte': """ + recebeFloat);
    }
}
