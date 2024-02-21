import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int N = 2;
        int[] A = {1};
        System.out.println(missingNumber(A,N));
    }
    static int missingNumber(int array[], int n) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] != i + 1){
                return i + 1;
            }
        }
        return n;
    }
}
