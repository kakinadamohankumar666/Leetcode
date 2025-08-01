class Solution {
  public boolean isUgly(int n) {
    // Only positive numbers can be ugly
    if (n <= 0) {
      return false;
    }

    // Remove all 2s
    while (n % 2 == 0) {
      n = n / 2;
    }

    // Remove all 3s
    while (n % 3 == 0) {
      n = n / 3;
    }

    // Remove all 5s
    while (n % 5 == 0) {
      n = n / 5;
    }

    // If n is 1 now, it means only 2,3,5 were used
    return n == 1;
  }
}
