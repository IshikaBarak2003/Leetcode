class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char sh:s.toCharArray()){
            map.put(sh,map.getOrDefault(sh,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();

    }
}
