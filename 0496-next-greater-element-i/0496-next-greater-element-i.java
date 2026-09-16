import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

      
        for (int i = nums2.length - 1; i >= 0; i--) {
            int x = nums2[i];

           
            while (!stack.isEmpty() && stack.peek() <= x) {
                stack.pop();
            }

            
            if (stack.isEmpty()) {
                map.put(x, -1);
            } else {
                map.put(x, stack.peek());
            }

           
            stack.push(x);
        }

        
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}