import java.util.Scanner;

public class Remove_Element {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int k = 0;
        for (int i =0;i<n;i++){
            if(arr[i]!=val){
                arr[k++] = arr[i];
            }

        }

        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remove_Element obj = new Remove_Element();
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array element : ");
        for(int i =0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println("eNTER THE VALUE :");
        int val = sc.nextInt();
        System.out.println(obj.removeElement(arr,val));
    }
}