public class MinMaxArray {
    public static void main(String[] args) {
        long N = 2;
        long A[] = {3,7};
        long max = computeMax(A,N);
        long min = computeMin(A,N);
        System.out.println(min);
        System.out.println(max);
    }
    static long computeMax(long[] A,long N){
        if(N == 1){
            return A[(int)N - 1];
        }
        return Math.max(A[(int) N-1],computeMax(A,N-1));
    }
    static long computeMin(long[] A,long N){
        if(N == 1){
            return A[(int)N - 1];
        }
        return Math.min(A[(int) N-1],computeMin(A,N-1));
    }

}
