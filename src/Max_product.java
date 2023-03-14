import java.util.Scanner;

public class Max_product {
    public int Max(int a,int b,int c,int d)
    {
        int x  = a>b?a:b;
        int y = c>d?c:d;
        return x*y;

    }
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c =sc.nextInt();
        d = sc.nextInt();
        Max_product obj = new Max_product();
        System.out.println(obj.Max(a,b,c,d));
    }
}
