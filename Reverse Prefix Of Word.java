class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder sb = new StringBuilder(word.substring(0,index+1));
        return sb.reverse().toString() + word.substring(index+1);
    }
}
