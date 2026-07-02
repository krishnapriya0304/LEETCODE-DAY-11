class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,right=0,count=0,ans=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            while(count>1){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            ans=Math.max(ans,right-left);
        }
        return ans;
    }
}
