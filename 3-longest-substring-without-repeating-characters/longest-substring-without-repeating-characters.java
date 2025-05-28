class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean [] seen = new boolean[128];
        int maxLength = 0;
        int start = 0;

        for(int end =0; end<s.length(); end++){
            char ch = s.charAt(end);

            while(seen[ch]){
            seen[s.charAt(start)] = false;
            start++;
        }
        seen[ch] = true;
        maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;  
    }

}