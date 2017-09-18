
public class StringReverse {

    public static String reverseString(String str){
        if(str == null){
            return str;
        }

        StringBuilder sb = new StringBuilder();
        char []c = str.toCharArray();

        for(int i = 0 ; i < c.length ; i++){
            sb.append(c[c.length - i - 1]);
        }

        return sb.toString();
    }

}
