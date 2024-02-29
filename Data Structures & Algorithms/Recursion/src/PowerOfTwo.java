public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(49));
    }

//    Recursive Approach
    static boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }else{
            return false;
        }
    }

//    Bit Manipulation approach
//    static boolean isPowerOfTwo(int n) {
//        if(n == 1){
//            return true;
//        }
//        if((n & n - 1) == 0){
//            return true;
//        }
//        return false;
//    }
}
