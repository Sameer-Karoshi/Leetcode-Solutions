class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.indexOf(part)>=0){
                StringBuffer text = new StringBuffer(s);
                s=text.replace(s.indexOf(part),s.indexOf(part)+part.length(),"").toString();
		}
        return s;
    }
}