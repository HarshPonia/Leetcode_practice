import java.util.*;
public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b == c){
                System.out.println("+");
            }
            else if(a-b == c){
                System.out.println("-");
            }
            n--;
        }
    }
}
