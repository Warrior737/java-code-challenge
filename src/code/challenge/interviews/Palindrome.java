package code.challenge.interviews;

public class Palindrome {

    public static boolean isPalindromeString(String text) {
        String cleanText = text.toLowerCase(); // Convert to lowercase for case-insensitivity
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeString("madam")); // true
        System.out.println(isPalindromeString("Racecar")); // true
        System.out.println(isPalindromeString("hello")); // false


        System.out.println(isPalindromeStringUsingStringBuilder("level")); // true
        System.out.println(isPalindromeStringUsingStringBuilder("world")); // false
    }

    public static boolean isPalindromeStringUsingStringBuilder(String text) {
        String cleanText = text.toLowerCase();
        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);
    }
}
