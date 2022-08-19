import java.util.Scanner;

public class Rotate_array {
    void swap(int arr[],int start,int end)
    {
        int t = arr[start];
        arr[start++] = arr[end];
        arr[end--] = t;
    }
    public void rotate(int nums[],int k){
        int n =nums.length;
        swap(nums,n-k,n-1);
        swap(nums,0,n-k-1);
        swap(nums,0,n-1);

/*
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
 */

    }
    public static void main(String[] args) {
        Rotate_array obj = new Rotate_array();
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of array : ");
        int n = sc.nextInt();
        arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to rotate the array :");
        int k = sc.nextInt();
        obj.rotate(arr,k);
    }
}
