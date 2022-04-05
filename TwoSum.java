class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int v = target-nums[i];
            Integer val = map.get(v);
            if(val != null){
                answer[0] = map.get(v);
                answer[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return answer;
    }
}