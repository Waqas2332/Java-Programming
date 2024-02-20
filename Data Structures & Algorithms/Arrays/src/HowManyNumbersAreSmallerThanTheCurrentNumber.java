import java.lang.reflect.Array;
import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] map = new int[101];
        int count = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        Arrays.sort(ans);

        int j = 0,k = 0;
        while(j < ans.length){
            map[ans[j]] = count;
            j++;
            if(j < ans.length && ans[j] == ans[k]){
                continue;
            }else{
                count += j - k;
                k = j;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = map[nums[i]];
        }
        return ans;
    }

}
