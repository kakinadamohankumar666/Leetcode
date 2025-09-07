class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == ch) {
                stack.deleteCharAt(len - 1); // remove last char
            } else {
                stack.append(ch); // push
            }
        }
        
        return stack.toString();
    }
}
