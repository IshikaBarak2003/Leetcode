class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];
        ArrayList<int[]> res = new ArrayList<int[]>();
        for(int i=0; i<n; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int l=0;
        int r=1;
        while(r<=n){
            if(r==n || start[r]>end[r-1]){
                int[] sol = new int[]{start[l], end[r-1]};
                res.add(sol);
                l=r;
            }
            r++;
        }
        return res.toArray(new int[res.size()][]);
    }
}

// class Solution {
    
//     public int[][] merge(int[][] intervals) {
//         Arrays.sort(intervals, (a1,a2)-> a1[0]-a2[0]); // O(NlogN)

//         Stack<int[]> stack = new Stack<>(); //O(N)
//         stack.push(intervals[0]);
//         int i=1;
//         while(!stack.isEmpty() && i < intervals.length){ //O(N)
//             int[] current = stack.peek();
//             int[] next = intervals[i++];
//             if(current[1]>=next[0]){
//                 stack.pop();
//                 current[1] = Math.max(current[1], next[1]);
//                 stack.push(current);
//             }else{
//                 stack.push(next);
//             }
//         }

//         return stack.toArray(new int[stack.size()][2]);
//     }
// }

