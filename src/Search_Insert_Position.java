import java.util.Scanner;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target){
        int low = 0,high = nums.length-1;
        while(low<=high){
            int mid  = low+(high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return nums.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search_Insert_Position obj = new Search_Insert_Position();
        int arr[] = new int[4];
        for(int i =0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        System.out.println(obj.searchInsert(arr,tar));
    }
}
