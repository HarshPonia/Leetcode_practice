import java.util.Arrays;
import java.util.Scanner;

public class Single_number {
    public int singleNumber(int[] nums) {
        int n =0;
        for (int x: nums) {
            n^=x;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element : ");
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Single_number obj = new Single_number();
        System.out.println(obj.singleNumber(arr));

    }
}
