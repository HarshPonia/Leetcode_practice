import java.util.Scanner;

public class Grab_the_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int even = 0,odd = 0;
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i =0;i<n;i++){
                if(arr[i]%2 == 0) even+=arr[i];
                else odd+=arr[i];
            }
            if(even>odd) System.out.println("Yes");
            else System.out.println("No");
            t--;
        }
    }
}