public class StringUtils {
    public int countVowels(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
