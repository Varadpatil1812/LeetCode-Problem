class Solution {
    public long sumAndMultiply(int n) {
        long new_n = 0;
        long sum = 0;
        long digit = 1;

        while (n > 0) {
            int d = n % 10;

            if (d != 0) {
                new_n = d * digit + new_n;
                digit *= 10;
                sum += d;
            }

            n /= 10;
        }

        return new_n * sum;
    }
}