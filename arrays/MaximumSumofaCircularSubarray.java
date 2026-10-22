import java.util.Scanner;

public class CircularSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum = 0;
        int maxEnding = 0;
        int minEnding = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];

            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(arr[i], minEnding + arr[i]);
            minSum = Math.min(minSum, minEnding);
        }

        if (maxSum < 0) {
            System.out.println("Maximum circular subarray sum: " + maxSum);
        } else {
            System.out.println("Maximum circular subarray sum: "
                    + Math.max(maxSum, totalSum - minSum));
        }

        sc.close();
    }
}
