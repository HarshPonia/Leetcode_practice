import java.util.Scanner;

public class Remove_duplicate_in_sorted_array {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if(n == 0|| n == 1) return n;
//        int temp[] = new int[n];
        int k = 0;
        for(int i =0;i< n-1;i++){
            if(arr[i]!=arr[i+1])
                arr[k++] = arr[i];

        }
        arr[k++]=arr[n-1];
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remove_duplicate_in_sorted_array obj = new Remove_duplicate_in_sorted_array();
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array element : ");
        for(int i =0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println(obj.removeDuplicates(arr));
    }
}
