import java.util.Arrays;
import java.util.Scanner;

// incomplete code

public class Contains_duplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = 0;
        int e = 0;
        for(int x :nums){
            if(n == 0)
                e = x;
            if(e == x)
                k++;
            else
                n-=1;
        }
        return k == nums.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array element : ");
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=  sc.nextInt();
        }
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();
        Contains_duplicate_2 obj = new Contains_duplicate_2();
        System.out.println(obj.containsNearbyDuplicate(arr,k));
    }
}
