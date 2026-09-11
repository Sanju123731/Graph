class Solution {
    public int trap(int[] arr) {
    //   int i=0;
    //   int j=arr.length-1;
    if(arr==null||arr.length==0)
    return 0;
      int maxWater=0;
      
    int leftMax[]=new int[arr.length];
    int rightMax[]=new int[arr.length];
   leftMax[0]=arr[0];
   rightMax[arr.length-1]=arr[arr.length-1];
    for(int i=1;i<arr.length;i++)
    {
        leftMax[i]=Math.max(leftMax[i-1],arr[i]);
    }
     for(int i=arr.length-2;i>=0;i--)
    {
        rightMax[i]=Math.max(rightMax[i+1],arr[i]);
    }
    for(int i=1;i<arr.length;i++)
    {
        maxWater+=Math.min(leftMax[i],rightMax[i])-arr[i];
    }
      return maxWater;

    }
}