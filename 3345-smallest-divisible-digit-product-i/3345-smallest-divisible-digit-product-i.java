class Solution {

    public int smallestNumber(int n, int t) {
        int a = n;

        while (true) {
            if (productOfDigits(a) % t == 0) {
                return a;
            }
            a++;
        }
    }

    private int productOfDigits(int num) {
        int product = 1;

        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }

        return product;
    }
}