package Staging;

public class CodingChallenge {
    public static int findNumberOfSquare(int a, int b) {
        double init = Math.sqrt(a);
        double finalValue = Math.sqrt(b);
        int result = (int) (Math.floor(finalValue) - Math.ceil(init)+1);
        return result;
    }
}
