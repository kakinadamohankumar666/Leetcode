class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            // Split the sentence by space and count the number of words
            int wordCount = sentence.split(" ").length;

            // Update the max if current word count is greater
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }

        return maxWords;
    }
}
