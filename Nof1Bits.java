public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0,mask=1;
        for(int i=0;i<32;i++){
            if((n & mask)!=0) count++;
            mask=mask<<1;  //shifting 1 to left to check rest of the bits
        }
        return count;
    }
}