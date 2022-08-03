import java.util.Scanner;

public class Rotate_array {
//    public void rotate(int arr[],int n,int k){
//        int p =1;
//        while (p<=k){
//            int last = arr[n-1];
//            for(int i =n-2;i>=0;i--){
//                arr[i+1] = arr[i];
//            }
//            arr[0] = last;
//            p++;
//        }
//     for(int i =0;i<n;i++){
//         System.out.print(arr[i] + " ");
//     }
//    }

    public void rotate(int arr[],int n,int k){
        int temp[] = new int[n];
        int j = 0;
        for(int i =n-k;i<n;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i =0;i<n-k;i++){
            temp[j] = arr[i];
            j++;
        }
        for(int i =0;i<n;i++){
         System.out.print(temp[i] + " ");
     }
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
        obj.rotate(arr,n,k);
    }
}
