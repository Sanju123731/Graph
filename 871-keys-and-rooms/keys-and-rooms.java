class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       boolean []vis=new boolean[rooms.size()];
       return bfs(rooms,vis);
    }
    public boolean  bfs(List<List<Integer>> rooms,boolean[]vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()) {
            int front=q.remove();
            for(int i=0;i<rooms.get(front).size();i++)
            {
           int key=rooms.get(front).get(i);
                if(!vis[key]) {
                    q.add(key);
                    vis[key]=true;
                    } } }
        for(int i=0;i<vis.length;i++)
        {
            if(!vis[i])
            {
                return false;
            }
        }
        return true;
    }
    
}