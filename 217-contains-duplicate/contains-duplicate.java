class Solution {
    public boolean containsDuplicate(int[] nums) {
    // Arrays.sort(nums);
    // for(int i=1;i<nums.length;i++)
    // {
    //     if(nums[i]==nums[i-1])
    //      return true;
    // }
    // return false;
      HashSet<Integer> Set=new HashSet<>();
      for(int num:nums)
      {
        if(Set.contains(num)) return true;
        Set.add(num);
      }
      return false;
    }
}