
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            if (i + 2 < n && arr[i + 1] > arr[i + 2]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i + 2];
                arr[i + 2] = temp;
            }
        }

        System.out.print("Wave array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
