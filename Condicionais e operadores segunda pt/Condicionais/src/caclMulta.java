public class caclMulta {
    public static void main(String[] args){
        int speed = 120;
        double amount;

        if (speed <= 80) {
            amount = 0;
            System.out.println("Não foi multado!");
        }
        else if (speed > 80 && speed <= 100){
            amount = 67;
        }
        else {
            amount = 70 + (speed - 100) * 10;
        }
        System.out.println("Você excedeu o limite de velocidade e foi multado em RS" + amount);
    }
}
