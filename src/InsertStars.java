
public class InsertStars {
    public static String insertPairStar(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" + insertPairStar(s.substring(1));
        }
        return s.charAt(0) + insertPairStar(s.substring(1));
    }
}
