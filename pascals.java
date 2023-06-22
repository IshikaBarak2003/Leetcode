class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> toadd=new ArrayList<>();
        
        for(int i=0;i<numRows;i++)
        {
            toadd.add(0,1);
            for(int j=1;j<toadd.size()-1;j++)
            {
                toadd.set(j,toadd.get(j)+toadd.get(j+1));
            }
            ans.add(new ArrayList<Integer>(toadd));
        }
        return ans;
    }
}
