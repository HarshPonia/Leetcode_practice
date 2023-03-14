import java.util.Scanner;

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int c = 0;
        for (int i =0;i<ransomNote.length();i++) {
            for(int j =0;i<magazine.length();j++){
                if(ransomNote.charAt(i)==magazine.charAt(j)){
                    c++;
//                    magazine.charAt(j)='';
                }
            }
        }
        return c==ransomNote.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1= sc.next();
        Ransom_Note obj = new Ransom_Note();
        System.out.println(obj.canConstruct(s,s1));
    }
}
