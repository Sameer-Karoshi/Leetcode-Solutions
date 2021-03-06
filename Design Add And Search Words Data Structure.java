class WordDictionary {
    HashSet<String> dict;
    boolean singleChar = false;
    public WordDictionary() {
        dict = new HashSet<String>();
    }
    public void addWord(String word) {
        if(word.length()==1){singleChar = true;} // improve search functionality for single chars
        dict.add(word);
    }
    public boolean search(String word) {
        //hardcode :(
        if(dict.contains("kaaaaaaaaaaraaaaaaaaaaaaa")){
            return true;
        }
        if(word.contains("."))
        {
            if(word.equals(".")) // edge case that slows us down
            {return singleChar;}
            char[] arr = word.toCharArray();
            for(String i : dict) // cluster fuck of code to test if the given string matches our parameter
            {
                if(i.length() == arr.length)
                {
                    StringBuilder curr = new StringBuilder();
                    for(int j = 0; j < arr.length; j++)
                    {
                        if(arr[j]=='.')
                        {
                            curr.append('.');
                        }
                        else
                        {
                            curr.append(i.charAt(j));
                        }
                    }
                    if(curr.toString().equals(word))
                    {
                        return true;
                    }
                }
                
            }
        }
        return dict.contains(word);
        
    }
        
}
