import java.util.Scanner;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target){
        for(int i =0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
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
