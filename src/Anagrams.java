import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagram(String input1, String input2) {
        if(input1 == null || input2 == null) return false;
        char []a = input1.toCharArray();
        char []b = input2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        input1 = new String(a);
        input2 = new String(b);
        return input1.equals(input2);
    }
}
