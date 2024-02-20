import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i],nums[i]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            target[i] = arrayList.get(i);
        }

        return target;
    }
}
