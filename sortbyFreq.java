class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> chars=new ArrayList<>(map.keySet());
        chars.sort((ch1,ch2) -> map.get(ch2)-map.get(ch1));

        StringBuilder ans=new StringBuilder();
        for(char ch:chars){
            int charCount=map.get(ch);
            for(int i=0;i<charCount;i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
