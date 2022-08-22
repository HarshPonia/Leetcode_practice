import javax.swing.*;
import java.util.Scanner;

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        long f = 1,l = num;
        long mid = 0;
        while(f<=l){
            mid = f+(l-f)/2;
            if(mid*mid == num)
                return true;
            else if(mid*mid<num)
                f = mid+1;
            else
                l = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Valid_Perfect_Square obj = new Valid_Perfect_Square();
        System.out.println(obj.isPerfectSquare(n));
    }
}
