class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = generateNext(result);
        }
        
        return result;
    }
    private String generateNext(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }
}
