package Staging;

public class CodingChallenge {
    public static int findNumberOfSquare(int a, int b) {
        int answer = 0;
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                answer += 1;
                System.out.println(i);
            }
        }
        return answer;
    }
}
