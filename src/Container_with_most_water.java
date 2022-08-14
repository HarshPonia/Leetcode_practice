import java.util.Arrays;
import java.util.Scanner;

public class Container_with_most_water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left<right){
            int lheight = height[left];
            int rheight = height[right];
//                    ""            System.out.println("Hello" +
//            );
            int min =  Math.min(lheight,rheight);
            max = Math.max(max,min*(right-left));
            if(lheight<rheight)
                left++;
            else
                right--;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number ");
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("hello");
        Container_with_most_water obj = new Container_with_most_water();
        System.out.println(obj.maxArea(arr));
    }
}
