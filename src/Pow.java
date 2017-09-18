
public class Pow {
    public static double pow(double x, int n) {
        int p = Math.abs(n);
        double res = 1;
        for(int i = 0 ; i < p ; i++){
            res *= x;
        }
        return (n > 0) ? res : 1 / res;
    }
}
