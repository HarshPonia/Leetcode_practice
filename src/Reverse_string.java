import java.util.Scanner;

public class Reverse_string {
    public void reversestring(char[] s){
            int low = 0,hight = s.length-1;
            while(low<hight){
                char c = s[low];
                s[low++] = s[hight];
                s[hight--] = c;
             }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        char []s = new char[n];
        for(int i =0;i<n;i++){
            s[i] = sc.next().charAt(i);
        }

    }
}
