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
