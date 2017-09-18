/**
 * Created by Sandro on 9/18/2017.
 */
public class BetterFibonacci {
    public static int betterFibonacci(int n) {
        if(n == 0) return 0;
        if(n < 3) return 1;
        return betterFibonacci(n - 2) + betterFibonacci(n - 1);
    }
}
