class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    list.add(1);
                }else{
                    list.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
                }
            }
            result.add(list);
        }
        return result.get(rowIndex); 
    }
}
