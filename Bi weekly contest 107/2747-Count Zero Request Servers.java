class Solution {

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = queries.length;
        int[] count = new int[n + 1], output = new int[m];
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Arrays.sort(logs, Comparator.comparingInt(log -> log[1]));
        for(int i=0;i<queries.length;i++){
            map.putIfAbsent(queries[i],new ArrayList<Integer>());
            map.get(queries[i]).add(i);
        }
        int p = 0,q = 0,c = n;
        for(Integer key:map.keySet()){
            while(q<logs.length && logs[q][1]<=key){
                int s = logs[q][0];
                if(count[s]++ == 0)c--;
                q++;
            }
            while(p<q && logs[p][1]<(key-x)){
                int s = logs[p][0];
                if(--count[s] == 0)c++;
                p++;
            }
            for(Integer index:map.get(key)) output[index] = c;
        }
        return output;
    }

}