package Interview_Problems;
import java.util.*;

public class _2089_Find_Target_Indices_After_Sorting_Array {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        List<Integer> list=new ArrayList<Integer>();
        int l = 0,count = 0;
        for(int i =0;i<nums.length;i++){
            if(target == nums[i] ) count++;
            if(target>nums[i]) l++;
        }
        for(int i =0;i<count;i++){
            list.add(l++);
        }
        return list;
    }
}
