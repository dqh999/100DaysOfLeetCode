public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(
                new int[]{100, -1, -2, -3, 50}
        ));
        System.out.println(solution.findCrossMax(
                (new int[]{1, 2, -10, 3, 4}),
                0, 2, 4
        ));
    }
}