class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (!contains(nums, i)) {
                missing.add(i);
            }
        }

        return missing;
    }

    public boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}