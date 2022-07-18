class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        int pairs = 0;
        for(int i = 1;i < nums.length;i++){
            if((nums[i] == nums[i-1]) && (nums[i] > -1 && nums[i-1] > -1)){
                pairs++;
                nums[i] = -1;
                nums[i-1] = -1;
            }
        }
        res[0] = pairs;
        res[1] = nums.length - 2*pairs;
        return res;
    }
}
