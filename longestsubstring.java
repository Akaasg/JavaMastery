import java.util.*;

class longestsubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxlength = 0;
        int left = 0;

        HashSet<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;

            }
            seen.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);

        }
        System.out.println(maxlength);
    }

}
