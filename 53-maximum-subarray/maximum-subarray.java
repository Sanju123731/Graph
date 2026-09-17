class Solution {
    public int maxSubArray(int[] nums) {
      int maxSum=nums[0];
      int currSum=0;
      if(nums.length==1) return maxSum; 
      for(int i=0;i<nums.length;i++)
      {
        currSum+=nums[i];
        maxSum=Math.max(maxSum,currSum);
        if(currSum<0)
        {
            currSum=0;
        }
      }
      return maxSum;
    }
}