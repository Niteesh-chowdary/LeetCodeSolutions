class Solution {
    public int longestString(int x, int y, int z) {
        int ans = 0;
        int start = Math.min(x,y);
        int left = start==x?y:x;
        ans += (start*2);
        if(left-start>0) ans++;
        ans+=z;
        return 2*ans;
    }
}