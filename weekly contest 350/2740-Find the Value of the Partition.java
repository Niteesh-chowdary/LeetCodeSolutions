class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            diff = Math.min(nums[i]-nums[i-1],diff);
        }
        return diff;
    }
}