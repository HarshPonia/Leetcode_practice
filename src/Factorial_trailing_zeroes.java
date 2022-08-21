


import java.util.Scanner;

public class Factorial_trailing_zeroes {
    public int Trailing_zeroes(int n)
    {
        int count = 0;
        while (n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial_trailing_zeroes obj = new Factorial_trailing_zeroes();
        System.out.println(obj.Trailing_zeroes(n));
    }
}
