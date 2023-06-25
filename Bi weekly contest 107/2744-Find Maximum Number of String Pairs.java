class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<words.length;i++){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb1.append(words[i]);
            sb2.append(words[i]);            
            String curr = sb2.reverse().toString();
            if(map.containsKey(curr)){
                map.put(curr,map.get(curr)+1);
            }
            else{
                map.put(sb1.toString(),1);
            }
        }
        for(String key:map.keySet()){
            if(map.get(key)>1){
                ans += (map.get(key)*(map.get(key)-1))/2;
            }
        }
        return ans;
    }
}