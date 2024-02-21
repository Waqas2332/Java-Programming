import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};
       reverseString(s);
    }
    static void helper(char[] s ,int i,int j){
        if(i > j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        helper(s,i+1,j-1);
    }
   static void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
}
