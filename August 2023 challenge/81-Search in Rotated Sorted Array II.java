class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) {
                left = i+1;
                right = i;
                break;
            }
        }
        return BinarySearch(nums,target,0,right) || BinarySearch(nums,target,left,nums.length-1);
    }
    public boolean BinarySearch(int[] nums,int target, int left, int right){
        if(left>right) return false;
        int mid = (left+right)/2;
        if(nums[mid] == target) return true;
        else if(nums[mid]>target) return BinarySearch(nums,target,left,mid-1);
        else return BinarySearch(nums,target,mid+1,right);
    }
}