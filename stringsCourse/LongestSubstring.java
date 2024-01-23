package stringsCourse;


public class LongestSubstring {

	public static void main(String[] args) {

		String input = "abcabcbb";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest substring without repeated characters: " + longestSubstring);
    }

    private static String findLongestSubstring(String input) {
        int n = input.length();
        int start = 0, end = 0;
        int maxLength = 0;
        int[] charIndex = new int[256]; // Assuming ASCII characters

        while (end < n) {
            if (charIndex[input.charAt(end)] == 0 || charIndex[input.charAt(end)] < start) {
                charIndex[input.charAt(end)] = end + 1;
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                start = charIndex[input.charAt(end)];
            }
        }

        return input.substring(start, start + maxLength);
	}
}