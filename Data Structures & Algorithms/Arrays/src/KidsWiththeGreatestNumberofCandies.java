import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        kidsWithCandies(candies,extraCandies);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int maxCandies = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(maxCandies < candies[i]){
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) >= maxCandies){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
