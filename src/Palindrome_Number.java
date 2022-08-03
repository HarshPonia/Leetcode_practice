import java.util.Scanner;

public class Palindrome_Number {

    public boolean isPalindrome(int x) {
        int reverse = 0;
        int y = x;
        if (x > 0) {
            int d = 0;

            while (x != 0) {
                d = x % 10;
                reverse = d+reverse*10;
                x = x / 10;
            }
        }
        return reverse == y ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Palindrome_Number obj = new Palindrome_Number();
        System.out.println(obj.isPalindrome(a));
    }
}
