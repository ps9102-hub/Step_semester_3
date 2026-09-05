public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        String[] tests = {"swiss", "aabbcc"};

        for (String test : tests) {
            char result = findFirstNonRepeatingChar(test);
            System.out.print("Input: \"" + test + "\" -> ");
            if (result != '\0') {
                System.out.println("First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("No Non-Repeating Character Found");
            }
        }
    }
}
