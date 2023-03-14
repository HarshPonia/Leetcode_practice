import java.util.Scanner;

public class Kevin_and_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();
            int mid = n/2+1, l = 1;
            for(int i = 1;i<=n/2;i++) {
                System.out.print(mid + " " + l);
                mid++;
                l++;
            }

            }
        }
    }

