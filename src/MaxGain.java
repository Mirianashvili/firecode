
public class MaxGain {
    public static int maxGain(int[] a) {
        int max = 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a.length ; j++){
                if(a[i] > a[j] && i > j && Math.abs(a[i] - a[j]) > max){
                    max = Math.abs(a[i] - a[j]);
                }
            }
        }
        return max;
    }
}
