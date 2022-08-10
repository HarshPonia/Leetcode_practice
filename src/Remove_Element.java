import java.util.Scanner;

public class Remove_Element {
    public int removeElement(int[] arr, int val) {
    int n = arr.length;
    int i =0;
    for (i =0;i<n;i++){
        if(arr[i]==val) {
                n--;
                for (int j =i;j<n;j++)
                    arr[j]=arr[j+1];
        }
    }

    return n;
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
