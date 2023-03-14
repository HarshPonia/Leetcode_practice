import java.util.Arrays;
import java.util.Scanner;

public class harsh {
    public boolean solve(int n,String S1,String S2,String S3){
        char[] s1 = S1.toCharArray();
        char[] s2 = S2.toCharArray();
        char[] s3 = S3.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        Arrays.sort(s3);
        String st1 = new String(s1);
        String st2 = new String(s2);
        String st3 = new String(s3);
        if(st1.equals(st2) || st1.equals(st3) || st2.equals(st3))
            return  true;
        else
            return  false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}

