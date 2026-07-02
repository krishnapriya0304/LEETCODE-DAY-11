class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        long sum=0,maxSum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            h1.put(nums[right],h1.getOrDefault(nums[right],0)+1);
            if(right-left+1>k){
                sum=sum-nums[left];
                h1.put(nums[left],h1.get(nums[left])-1);
                if(h1.get(nums[left])==0){
                    h1.remove(nums[left]);
                }
                left++;
            }
            if(right-left+1==k && h1.size()==k){
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
