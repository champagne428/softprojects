//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class project2 {
    public project2() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 5, -1};
        System.out.println(GetMxSum(arr));
    }

    public static int GetMxSum(int[] arr) {
        if (arr != null && arr.length != 0) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for(int i = 0; i < arr.length; ++i) {
                if (currentSum < 0) {
                    currentSum = arr[i];
                } else {
                    currentSum += arr[i];
                }

                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
