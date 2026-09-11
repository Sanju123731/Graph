class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxWater=Integer.MIN_VALUE;
        
        while(i<j)
        {
        int width=j-i;
        int length=Math.min(height[i],height[j]);
        int area=length*width;
        maxWater=Math.max(maxWater,area);
       if(height[i]<height[j])
       {
        i++;
       }
       else
       j--;
        }
        return maxWater;
    }
}