/*
    Date :  19/aug/2022
    Author : Harsh Ponia
    Problem : 172. Factorial Trailing Zeroes
    Difficulty : Medium
    Description : Given an integer n, return the number of trailing zeroes in n!.
                  Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
    Example 1:
        Input: n = 3
        Output: 0
        Explanation:
                    3! = 6, no trailing zero.
 */
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
