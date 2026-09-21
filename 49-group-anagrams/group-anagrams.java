class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        
       List< List<String>> ans=new ArrayList<>();
         if(strs==null|| strs.length==0) 
         {
            return ans;
         }
        boolean[]vis=new boolean[strs.length];
  for(int i=0;i<strs.length;i++)
  {
    if(vis[i])  {
         continue; 
             } 
    String word=strs[i];
    int[]freq=new int[26];
    for(int j=0;j<word.length();j++)
    {
        freq[word.charAt(j)-'a']++;
    }
    List<String> res=new ArrayList<>();
    res.add(word);
    vis[i]=true;

    for(int k=i+1;k<strs.length;k++)
    {
        if(vis[k]) continue;
        if(strs[k].length()!=word.length()) continue;
        int[]temp=freq.clone();
        for(int j=0;j<strs[k].length();j++)
        {
            temp[strs[k].charAt(j)-'a']--;
        }
        boolean isAnagram=true;
        for(int j=0;j<26;j++)
        {
            if(temp[j]!=0)
            {
                isAnagram=false;
                break;
            }
        }
            if(isAnagram)
            {
                res.add(strs[k]);
                vis[k]=true;
            }
        }
        ans.add(res);
    }
    return ans;
  }
    
}

