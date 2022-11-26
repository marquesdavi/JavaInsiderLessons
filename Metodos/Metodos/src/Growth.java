public class Growth {
    public static void main(String[] args){
        System.out.println(calculateGrowth(23, 51) + " %");
    }


    static double calculateGrowth(double startValue, double endValue){
        return ((endValue - startValue) / startValue) * 100;
    }
}
