//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"

//a b c a b c
// a b c
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
//F[i][j] = F[i-1][j-1]+1, else F[i][j] = max(F[i-1][j], F[i][j-1])
public  class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        // Find the greatest common divisor of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 with length equal to the gcd
        return str1.substring(0, gcdLength);
    }

    // Helper function to find the greatest common divisor (GCD) of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
