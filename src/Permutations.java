import java.util.Arrays;

public class Permutations {
    public static boolean permutation(String str1, String str2) {
        char [] a = str1.toCharArray();
        char [] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        str1 = new String(a);
        str2 = new String(b);
        return str1.equals(str2);
    }
}
