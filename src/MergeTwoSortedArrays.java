/**
 * Created by Sandro on 9/18/2017.
 */
public class MergeTwoSortedArrays {
    public static int[] merge(int[] arrLeft, int[] arrRight){
        int []a = new int [arrRight.length + arrLeft.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arrLeft.length && j < arrRight.length){
            if(arrLeft[i] <= arrRight[j]){
                a[k] = arrLeft[i];
                i++;
            }else{
                a[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while(i < arrLeft.length){
            a[k] = arrLeft[i];
            i++;
            k++;
        }

        while(j < arrRight.length){
            a[k] = arrRight[j];
            k++;
            j++;
        }

        return a;
    }
}
