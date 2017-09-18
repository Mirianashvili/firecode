import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicatesList {
    public static ArrayList<String> removeDuplicates(List<String> input) {
        ArrayList<String> result = new ArrayList<String>();
        TreeSet<String> tree = new TreeSet<String>();

        for(int i = 0 ; i < input.size() ; i++){
            String item = input.get(i);

            if(!tree.contains(item)){
                result.add(item);
                tree.add(item);
            }
        }

        Collections.sort(result);

        return result;
    }
}
