import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        for (int j : arr) {
            if (j > 1) {
                ans += (j * (j - 1)) / 2;
            }
        }
        return ans;
    }
}
