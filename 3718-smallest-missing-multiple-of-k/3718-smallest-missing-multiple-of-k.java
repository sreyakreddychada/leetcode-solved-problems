class Solution {
    public int missingMultiple(int[] nums, int k) {
        int j = 1;

        while (true) {
            int multiple = k * j;
            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (multiple == nums[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return multiple;
            }

            j++;
        }
    }
}