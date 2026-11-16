class Solution {
    public int trap(int[] arr) {
    //   int i=0;
    //   int j=arr.length-1;
    
    int left[]=new int[arr.length];
     int right[]=new int[arr.length];
     left[0]=arr[0];
     right[arr.length-1]=arr[arr.length-1];
    int maxWater=0;
    for(int i=1;i<arr.length;i++)
    {
       left[i]=Math.max(left[i-1],arr[i]);
    }
   for(int j=arr.length-2;j>=0;j--)
   {
    right[j]=Math.max(right[j+1],arr[j]);
   }
   for(int i=0;i<arr.length;i++)
   {
    maxWater+=Math.min(left[i],right[i])-arr[i];
   }
   return maxWater;
    }
}

// int n=arr.length;
//     int maxWater=0;
//      int [] left=new int[n];
//      int [] right=new int[n];
//      left[0]=arr[0];
//      right[n-1]=arr[n-1];
//      for(int i=1;i<n;i++)
//      {
//         left[i]=Math.max(left[i-1],arr[i]);
//      }
//      for(int i=n-2;i>=0;i--)
//      {
//         right[i]=Math.max(right[i+1],arr[i]);

//      }
//      for(int i=0;i<n;i++)
//      {
//         maxWater+=Math.min(left[i],right[i])-arr[i];
//      }
//      return maxWater;
//     }
// }