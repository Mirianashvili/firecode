
public class BinaryRepresentation {
    public static String computeBinary(int val) {
        StringBuilder sb = new StringBuilder();
        if(val == 0){
            return "0";
        }
        while(val > 0){
            if(val % 2 == 0){
                sb.append("0");
            }else{
                sb.append("1");
            }
            val /= 2;
        }
        char [] c = sb.toString().toCharArray();
        for(int i = 0 ; i < c.length / 2 ; i++){
            char t = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = t;
        }
        return new String(c);
    }
}
