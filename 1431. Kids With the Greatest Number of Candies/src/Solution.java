import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = 0;
        for (int i : candies) {
            maxCandie = Math.max(maxCandie, i);
        }
        List<Boolean> res = new ArrayList<>(candies.length);
        for (int i : candies) {
            if ((i + extraCandies) >= maxCandie) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }
}