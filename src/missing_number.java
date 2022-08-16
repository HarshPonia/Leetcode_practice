/*
    Date :  16/aug/2022
    Author : Harsh Ponia
    Problem : 268. Missing Number
    Difficulty : Easy
    Description : Given an array nums containing n distinct numbers in the range [0, n], return the only number in the
    range that is missing from the array.
    Example 1:
        Input: nums = [3,0,1]
        Output: 2
        Explanation:
            n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

 */



import java.util.Scanner;

public class missing_number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s =0;
        for(int i =0;i<n;i++){
            s+=nums[i];
        }
        return (n*(n+1)/2)-s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        missing_number obj = new missing_number();
        System.out.println(obj.missingNumber(arr));
    }
}
