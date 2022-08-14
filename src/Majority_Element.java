import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for (int i =0;i<nums.length;i++){
            if(nums[i]==nums[i+ nums.length/2]){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        System.out.println("Enter the array element : ");
        int[] arr = new int[n];
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Majority_Element obj = new Majority_Element();
        System.out.println(obj.majorityElement(arr));


    }
}
