class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}
