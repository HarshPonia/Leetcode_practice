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
