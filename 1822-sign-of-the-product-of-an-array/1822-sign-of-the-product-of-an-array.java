class Solution {
    public int arraySign(int[] nums) {
        int sign =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                sign++;
            
            }else if(nums[i]==0){
                return 0;
            }
        }
        return (sign%2 ==0 ? 1:-1);
    }
}