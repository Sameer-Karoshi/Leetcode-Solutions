class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(int i = 0;i < sentence.length();i++){
            int ch = sentence.charAt(i);
            freq[ch-97]++;
        }
        for(int i = 0;i < 26;i++){
            if(freq[i] == 0){
                return false;
            }
        }
        return true;
    }
}
