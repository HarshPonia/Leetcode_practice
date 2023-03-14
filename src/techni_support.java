import java.util.Scanner;

public class techni_support {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String st = sc.next();
            int q = 0;
            for(int i =0;i<n;i++){
                if(st.charAt(i) == 'Q') q++;
                else if(st.charAt(i) == 'A' && q!=0) q--;
            }
            if(q==0) System.out.println("yes");
            else System.out.println("no");
        }

    }
}
