class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] square = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            square[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(square);
        return square;
    }
}