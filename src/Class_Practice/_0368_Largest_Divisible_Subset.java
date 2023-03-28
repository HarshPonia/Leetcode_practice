package Class_Practice;
import java.util.*;
// Date : 28/03/2023
// Dynamic Potgramming
// Sorting
// Array .
public class _0368_Largest_Divisible_Subset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length == 0) return list;
        Arrays.sort(nums);
        List<List<Integer>> dp = new ArrayList<>();
        for(int num:nums) dp.add(new ArrayList<>());
        for(int i  =0;i<nums.length;i++){
            List<Integer> max = new ArrayList<>();
            for(int k = 0;k<i;k++){
                if(nums[i]%nums[k] == 0 && max.size()<dp.get(k).size()){
                    max = dp.get(k);
                }
            }
            dp.get(i).addAll(max);
            dp.get(i).add(nums[i]);

        }
        for(int  i =0;i<dp.size();i++){
            if(list.size()<dp.get(i).size()){
                list=dp.get(i);
            }
        }
        return list;
    }
}
