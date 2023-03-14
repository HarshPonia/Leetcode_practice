import java.util.Scanner;

public class Jump_Game_II {
    public int jump(int[] nums) {
        int reach=0;
        int c=0;
        for (int i = 0; i < nums.length; i++) {

            if(i+nums[i]>reach)
            {
                reach = Math.max(reach,i+nums[i]);
                i=reach-i;
                c++;
            }
        }
    return c;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array  : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array element  : ");
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Jump_Game_II obj = new Jump_Game_II();
        System.out.println(obj.jump(arr));
    }
}
