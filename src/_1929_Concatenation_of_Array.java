public class _1929_Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int n  = nums.length;
        int [] arr = new int[n+n];
        for(int i =0;i<n;i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}
