class Solution {
    public int heightChecker(int[] heights) {
      int[] Heights = new int[heights.length];
      for(int i = 0;i < heights.length;i++){
          Heights[i] = heights[i];
      }
      Arrays.sort(heights);
      int res = 0;
      for(int i = 0;i < heights.length;i++){
          if(Heights[i] != heights[i]){
              res++;
          }
      }
     return res;
    }
}
