class Solution {
    public int addDigits(int num) {
        while (num >= 10) {  // Repeat until we get a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
