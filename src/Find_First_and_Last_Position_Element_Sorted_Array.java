import java.util.Scanner;

public class Find_First_and_Last_Position_Element_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i]!=target)
                    continue;
                if(arr[0] == -1)
                    arr[0] = i;
                arr[1] = i;
            }
            return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array element : ");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        Find_First_and_Last_Position_Element_Sorted_Array obj = new Find_First_and_Last_Position_Element_Sorted_Array();
        System.out.println(obj.searchRange(arr,target));
    }
}
