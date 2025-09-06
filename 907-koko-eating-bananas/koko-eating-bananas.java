class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Minimum speed Koko can eat = 1 banana/hour
        int low = 1;
        // Maximum speed = the biggest pile (because no need to eat faster than that)
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        // Binary search between [1, max(piles)]
        while (low < high) {
            int mid = low + (high - low) / 2; // candidate speed

            if (canFinish(piles, h, mid)) {
                // If Koko can finish with speed = mid
                // then try to see if a smaller speed also works
                high = mid;
            } else {
                // If she cannot finish in time
                // then she needs to eat faster
                low = mid + 1;
            }
        }

        // When low == high, that’s the minimum speed
        return low;
    }

    // Helper function: check if Koko can finish with speed = k
    private boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            // Time to eat this pile = ceil(pile / k)
            hours += (pile + k - 1) / k; // trick to avoid using Math.ceil
        }
        return hours <= h;
    }
}
