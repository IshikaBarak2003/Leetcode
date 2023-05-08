class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int[] small=new int[nums.length];
        small[0]=nums[0];

        if(nums.length<3){
            return false;
        }
        for(int i=1;i<nums.length;i++){
            small[i]=Math.min(small[i-1],nums[i]);
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>small[i]){
                while(!stk.isEmpty() && stk.peek()<=small[i]){
                    stk.pop();
                }
                if(!stk.isEmpty() && nums[i]>stk.peek()){
                    return true;
                }
                stk.push(nums[i]);
            }
        } 
        return false;
    }
}
