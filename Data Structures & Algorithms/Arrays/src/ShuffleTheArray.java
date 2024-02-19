import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0,j = n;
        int index = 0;
        while(i < n){
            ans[index++] = nums[i];
            ans[index++] = nums[j];
            i++;
            j++;
        }

        return ans;
    }
}
