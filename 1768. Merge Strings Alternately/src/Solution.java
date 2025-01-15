public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        int n = Math.max(n1,n2);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i<n1) result.append(word1.charAt(i));
            if (i<n2) result.append(word2.charAt(i));
        }
        return result.toString();
    }
}