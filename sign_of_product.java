class Solution {
    public int arraySign(int[] nums) {
        double prod=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) return 0;
            prod*=nums[i];
        }
        return prod>0 ? 1:-1;
    }
}
