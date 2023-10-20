package javacore;

public class SwitchCase {

    public static void main(String[] args) {
        String escolheCar = "Corolla";
        String carac = "A";

        switch (escolheCar) {
            case "Corolla":
                carac = "Carro do tipo Sedan, rodas de aro 17, e fabricado pela Toyota.";
                break;
            case "Uno":
                carac = "Carro do tipo Hert, rodas aro 13 e fabricado pela Fiat";
                break;
            default:
                System.out.println("Nenhum");

        }

        System.out.println("Caracteristicas " + carac);
    }

}
