class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String reversed;
        if (s.charAt(0) == '-') {
            String digits = s.substring(1);
            reversed = "-" + new StringBuilder(digits).reverse().toString();
        } else {
            reversed = new StringBuilder(s).reverse().toString();
        }
        try {
            return Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
