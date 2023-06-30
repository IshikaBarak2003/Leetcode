class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set=new HashSet<>();
        int[] sol=new int[A.length];
        for(int i=0;i<A.length;i++){
            int count=0;
            if(set.contains(A[i])){
                count++;
            }
            if(set.contains(B[i])){
                count++;
            }
            if(A[i]==B[i]){
                count++;
            }
            sol[i]=count;
            if(i > 0) sol[i]+= sol[i-1];
            set.add(A[i]);
            set.add(B[i]);

        }
        return sol;
    }
}
