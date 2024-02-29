public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    static int count = 0;
    static int numberOfSteps(int num) {
        if(num == 1){
            return count + 1;
        }
        if(num % 2 == 0){
            count++;
            return numberOfSteps(num / 2);
        }else{
            count++;
            return numberOfSteps(num - 1);
        }
    }
}
