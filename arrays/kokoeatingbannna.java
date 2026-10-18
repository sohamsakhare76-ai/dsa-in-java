
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int ans = max;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            long sum = 0;

            for (int j = 0; j < piles.length; j++) {
                long k = (piles[j] + (long) mid - 1) / mid;
                sum += k;
            }

            if (sum <= h) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return ans;
    }
}
