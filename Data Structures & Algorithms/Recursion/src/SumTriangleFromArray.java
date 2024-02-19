import java.util.ArrayList;
import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
       long A[] = {1,3 ,4 ,5, 2};
        System.out.println(Arrays.toString(getTriangle(A,A.length)));
    }

    static ArrayList<Long> arrayList = new ArrayList<Long>();
    static void helper(long[] arr, long n){
        if(arr.length == 1){
            return;
        }
        long[] ans = new long[(int) n - 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[i] + arr[i + 1];
        }
        helper(ans,n-1);
        for (long an : ans) {
            arrayList.add(an);
        }
    }
    static long[] getTriangle(long arr[], long n)
    {
        helper(arr,n);
        for (long l : arr) {
            arrayList.add(l);
        }
        long[] ans = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            ans[i] = arrayList.get(i);
        }
        return ans;
    }
}
