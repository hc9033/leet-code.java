class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] != 0 ){
                int temp = nums[nonzero];
                nums[nonzero]=nums[j];
                nums[j]=temp;
                nonzero++;  
            }
        }
    }
}