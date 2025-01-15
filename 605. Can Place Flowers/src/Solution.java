
public class Solution {
    // [1,0,0,0,1]
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int fLength = flowerbed.length;
        if (fLength == 1) return flowerbed[0] == 0 && n == 1;
        if (fLength == 2 && flowerbed[0] == 0 && flowerbed[1] == 0 && n == 1) return true;

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            n--;
            if (n == 0) return true;
            flowerbed[0] = 1;
        }

        for (int i = 1; i < fLength; i++) {
            if (checkPlace(flowerbed, fLength-1, i)) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) return true;
            }
        }
        return false;
    }

    public boolean checkPlace(int[] flowerbed, int length, int visitedX) {
        if (visitedX==length && flowerbed[visitedX] == 0 && flowerbed[visitedX-1] == 0 ) return true;
        return flowerbed[visitedX] == 0 && flowerbed[visitedX-1] == 0 && flowerbed[visitedX+1] == 0;
    }
}