public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
            int startAlt = 0;
            int maxAlt = 0;

            for (int i = 0; i < gain.length; i++) {
                startAlt += gain[i];
                if(startAlt > maxAlt){
                    maxAlt = startAlt;
                }
            }
            return maxAlt;
    }
}
