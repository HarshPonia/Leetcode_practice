import java.util.Scanner;

public class Plus_One {
    public int[] plusOne(int[] digits) {
        for (int i =digits.length-1;i>=0;i--)
        {
            if(digits[i]<9){
                digits[i]= digits[i]+1;
            }
            digits[i] = 0;
        }
        int[] nums = new int[digits.length+1];
        nums[0] = 1;
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plus_One obj = new Plus_One();
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(obj.plusOne(arr));
    }
}
