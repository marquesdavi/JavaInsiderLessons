public class Bissesto {
    public static void main(String[] args) {
        System.out.println(isLeap(2024));
    }

    static boolean isLeap(int year) {
        if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
            System.out.println("É bissesto");
            return true;
        }
        System.out.println("Não é bissesto");
        return false;
    }
}
