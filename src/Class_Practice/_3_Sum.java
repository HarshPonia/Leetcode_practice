package Class_Practice;
import java.util.*;
public class _3_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        if(nums==null || nums.length<3) return output;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            int sum=0-nums[i];
            while(j<k){
                if(nums[j]+nums[k]==sum){
                    output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                }else if(nums[j]+nums[k]<sum){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return output;
    }
}
