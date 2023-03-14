package Leetcode_75.Day_01;

public class _0724_Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        int n =  nums.length;
        int sum = 0;
        int temp =0;
        for(int i =0;i<n;i++){
            sum+=nums[i];
        }
        for(int j = 0;j<n;j++){
            sum -= nums[j];
            if(sum == temp)return j;
            temp += nums[j];
        }
        return -1;
    }
}
