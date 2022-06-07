class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(int i = 0;i < word1.length();i++){
            int ch = word1.charAt(i);
            arr1[ch-97]++;
        }
        
        for(int i = 0;i < word2.length();i++){
            int ch = word2.charAt(i);
            arr2[ch-97]++;
        }
        
        for(int i = 0;i < 26;i++){
            if(Math.abs(arr1[i]-arr2[i]) > 3){
                return false;
            }
        }
        return true;
    }
}
