public class Length_of_last_word
{
    public int lengthoflast(String s){
        int c = 0;
        for (int  i =s.length();i>=0;i--) {
            if (s.charAt(i) != ' ')
                c++;
            else if (c > 0)
                return c;
        }
        return c;
    }
    public static void main(String[] args) {

    }
}
