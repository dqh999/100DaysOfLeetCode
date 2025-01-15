public class Solution {
    public boolean isMatch(String s, String p) {
        return backtracking(s, p, 0, 0);
    }
    public boolean backtracking(String s, String p, int i, int j) {
        if (i == s.length() && j == p.length()) {
            return true;
        }
        if (i >= s.length() || j >= p.length()) {
            return false;
        }


        return false;
    }
}