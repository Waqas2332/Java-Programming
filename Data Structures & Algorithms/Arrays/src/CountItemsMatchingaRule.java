import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item:items) {
            if(ruleKey == "type"){
                if(ruleValue == item.get(0)){
                    count++;
                }
            }
            else if(ruleKey == "color"){
                if(ruleValue == item.get(1)){
                    count++;
                }
            }
            else{
                if(ruleValue == item.get(2)){
                    count++;
                }
            }
        }
        return count;
    }
}
