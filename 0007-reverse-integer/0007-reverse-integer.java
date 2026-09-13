class Solution {
    public int reverse(int x) {
        int b = 0;

        while (x != 0) {
            int a = x % 10;
            x = x / 10;

           
            if (b > Integer.MAX_VALUE / 10 ||
                (b == Integer.MAX_VALUE / 10 && a > 7)) {
                return 0;
            }

            if (b < Integer.MIN_VALUE / 10 ||
                (b == Integer.MIN_VALUE / 10 && a < -8)) {
                return 0;
            }

            b = (b * 10) + a;
        }

        return b;
    }
}