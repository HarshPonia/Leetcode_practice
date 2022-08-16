/*
    Date : 16/aug/2022
    Author : Harsh Ponia
    Problem: 283. Move Zeroes
    Difficulty: Easy
    Description : Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
    non-zero elements.
    Note :that you must do this in-place without making a copy of the array.
    Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
     */



import java.util.Scanner;

public class move_zeroes {
    public void moveZeroes(int[] nums) {
        int j =0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        while (j<nums.length)
            nums[j++] = 0;
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        move_zeroes obj = new move_zeroes();
       obj.moveZeroes(arr);
    }
}
