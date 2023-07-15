class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a1,a2)->Integer.compare(a1[0],a2[0]));
        Stack<int[]> stk=new Stack<>();
        stk.push(intervals[0]);
        int i=1;
        while(!stk.isEmpty() && i<intervals.length){
            int[] curr=stk.peek();
            int[] next=intervals[i];
            if(next[0]<=curr[1]){
                stk.pop();
                curr[1]=Math.max(curr[1],next[1]);
                stk.push(curr);
            }
            else{
                stk.push(next);
            }
            i++;
        }
        return stk.toArray(new int[stk.size()][2]);
    }
}
