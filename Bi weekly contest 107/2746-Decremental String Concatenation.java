class Solution {
    Integer[][][] dp;
    public int minimizeConcatenatedLength(String[] words) {
        dp= new Integer[words.length + 1][26][26];
        return words[0].length() + helper(1 , words[0].charAt(0) , words[0].charAt(words[0].length() - 1) , words);
    }
    
    public int helper(int i , char first , char last , String[] words){
        if( i >= words.length) return 0;
        
        if(dp[i][first - 'a'][last - 'a'] != null) return dp[i][first - 'a'][last - 'a'];
        int a = 0;
        int b = 0;
        a = words[i].length() + helper(i + 1 , words[i].charAt(0) , last , words);
        b = words[i].length() + helper(i + 1 , first , words[i].charAt(words[i].length() - 1) , words);
        if(first == words[i].charAt(words[i].length() - 1)) a = a-1;
        if(last == words[i].charAt(0)) b = b-1;
        return dp[i][first - 'a'][last - 'a'] = Math.min(a , b);
    }
}