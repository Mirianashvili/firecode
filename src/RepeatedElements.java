import java.util.ArrayList;
import java.util.TreeSet;

public class RepeatedElements {
    public static String duplicate(int[] numbers){
        TreeSet<Integer> a = new TreeSet<Integer>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i = 0 ; i < numbers.length ; i++){
            if(!a.contains(numbers[i])){
                a.add(numbers[i]);
            }else{
                x.add(numbers[i]);
            }
        }
        return x.toString();
    }
}
