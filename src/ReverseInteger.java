/**
 * Created by Sandro on 9/18/2017.
 */
public class ReverseInteger {
    public static int reverseInt(int x) {
        int sign = 0;
        if(x < 0) { sign = 1; x *= -1;}
        int t = 0;
        while(x > 0){
            t = t * 10 + x % 10;
            x /= 10;
        }
        t = (sign == 1) ? -t : t;
        return t;
    }
}
