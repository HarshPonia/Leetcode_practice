import java.util.Scanner;

public class banvan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int i = 2,j = 3*n;
        System.out.println((n+1)/2);
        while(i<j){
            System.out.println(i+" "+j);
             i = i+3;
             j = j-3;
        }
    }
}
