class Solution {
    public int smallestIndex(int[] nums) {

     for(int i=0;i<nums.length;i++){
        int x=0;
        while(nums[i]>0){
        x+=nums[i]%10;
        nums[i]/=10;
        }
        if(x==i){
            return i;
        }
     } 
     return -1;
    }
}