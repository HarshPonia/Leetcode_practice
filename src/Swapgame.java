import java.util.Scanner;

public class Swapgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int x = Integer.MAX_VALUE;
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                if(x>arr[i]) x = arr[i];
            }
            System.out.println(x);
            if(x == arr[0]) System.out.println("bob");
            else System.out.println("alice");
        }
    }
}
