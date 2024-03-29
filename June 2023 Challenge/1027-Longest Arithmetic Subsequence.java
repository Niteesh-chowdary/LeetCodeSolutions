// Time Complexity - O(N^2)
// Space Complexity - O(N^2)
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer>[] dp = new HashMap[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i] = new HashMap<>();
            for(int j=0;j<i;j++){
                int diff = nums[j] - nums[i];
                dp[i].put(diff,dp[j].getOrDefault(diff,1)+1);
                ans = Math.max(ans,dp[i].get(diff));
            }
        }
        return ans;
    }
}