package backtracking;

public class GenerationDigit {
    public void generate(int k) {
        for (int i = 1; i <= 9; i++) {
            int[] result = new int[k];
            result[0] = i;
            backtrack(result, 1, k-1);
        }
    }

    private void backtrack(int[] result, int i, int k) {
        for (int j = 0; j <= 9; j++) {
            if (i > k){
                break;
            }
            result[i] = j;
            if (i == k){
                int sum = calculateSum(result);
                if (sum % 3 == 0){
                    for (int r : result) {
                        System.out.print(r);
                    }
                    System.out.println();
                }
            }
            backtrack(result, i + 1, k);
        }
    }

    private int calculateSum(int[] a){
        int sumresult = 0;
        for (int r : a) {
            sumresult += r;
        }
        return sumresult;
    }
}
