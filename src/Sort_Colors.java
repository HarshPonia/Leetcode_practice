import java.util.Scanner;

public class Sort_Colors {
    private void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b] =temp;
    }
    public void sortColors(int[] nums){
        int mid = 0,low  = 0,high = nums.length;
        while(low<high){
           if (nums[mid] == 0){
               swap(nums,low,mid);
               low++;
               mid++;
           }
           else if(nums[mid]==1){
               mid++;
           }
           else {
               swap(nums,mid,high);
               high--;
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Sort_Colors obj = new Sort_Colors();
        obj.sortColors(arr);
    }
}
