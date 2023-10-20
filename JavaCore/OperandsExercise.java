package javacore;

public class OperandsExercise {
    public static void main(String[] args) {
        double first = 15 - 5 * 2;
        double second = (3 - 1) / 2;

        boolean r = first > second && 4 <= 2*2 || !(2!=4);

        System.out.println(r);
    }
}
