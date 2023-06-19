class Solution {
    private int[] map;
    public int findCircleNum(int[][] isConnected) {
        map = new int[isConnected.length];
        for(int i=0;i<map.length;i++){
            map[i] = i;
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=i+1;j<isConnected.length;j++){
                if(isConnected[i][j] == 1){
                    int pa = find(i);
                    int pb = find(j);
                    if(pa<pb)map[pb] = pa;
                    else map[pa] = pb;
                }
            }
        }
        for(int i=0;i<map.length;i++){
            map[i] = find(map[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num:map) set.add(num);
        return set.size();
    }
    public int find(int x){
        if(map[x] != x) map[x] = find(map[x]);
        return map[x];
    }
}