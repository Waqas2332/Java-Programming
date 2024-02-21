public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        int[] map = new int[26];
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            int ascii = (int) sentence.charAt(i);
            map[ascii - 97] = 1;
        }
        for (int j : map) {
            if (j == 1) {
                count++;
            }
        }
        return count == 26;
    }
}
