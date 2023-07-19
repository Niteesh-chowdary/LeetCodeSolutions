class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int[] diffArr = new int[40001];
        int ans = 1;
        for(int i: arr){
            diffArr[i+20000] = diffArr[i-difference+20000]+1;
            ans = Math.max(ans,diffArr[i+20000]);
        }
        return ans;
    }
}