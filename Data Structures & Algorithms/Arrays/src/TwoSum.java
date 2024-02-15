import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twoSum(nums,target);
    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            boolean isPresent = map.containsKey(diff);
            if(isPresent && map.get(diff) != i){
                ans[0] = i;
                ans[1] = map.get(diff);
                return ans;
            }
        }
        return ans;
    }

}
