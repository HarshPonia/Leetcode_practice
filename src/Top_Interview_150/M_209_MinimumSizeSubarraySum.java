package Top_Interview_150;
//Date: 06-06-2023




public class M_209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                ans = Math.min(ans,i+1-l);
                sum-=nums[l++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0: ans;
    }
}
