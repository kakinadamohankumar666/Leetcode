class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int best_i = values[0]; // best values[i] + i
        int maxScore = Integer.MIN_VALUE;

        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, best_i + values[j] - j);
            best_i = Math.max(best_i, values[j] + j);
        }

        return maxScore;
    }
}
