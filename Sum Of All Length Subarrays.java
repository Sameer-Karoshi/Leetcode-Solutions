class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            int temp = 0;
            for(int j = i;j < arr.length;j++){
                if((j-i+1)%2 == 1){
                    temp = temp + arr[j];
                    sum = sum + temp;
                }
                else{
                    temp = temp + arr[j];
                }
            }
        }
        return sum;
    }
}
