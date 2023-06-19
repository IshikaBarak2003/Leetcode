 public int rob(int[] nums){
        //Tabulation
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        if(n==1){
            return nums[0];
        }
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int incl=dp[i-2]+nums[i];
            int excl=dp[i-1]+0;
            dp[i]=Math.max(incl,excl);
        }
        return dp[n-1]; 
    }
}
