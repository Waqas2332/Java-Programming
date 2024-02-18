public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1,2,3,4,5));
    }
//    var args are used to recieve variable number of arguments in the same function
    static int sum(int ...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
