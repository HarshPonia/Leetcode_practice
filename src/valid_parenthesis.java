import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {
    public boolean  check(String str){
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            switch (c) {
                case '(': s.push(c); break;
                case '{': s.push(c); break;
                case '[': s.push(c); break;
                case ')': if (s.empty() || s.peek()!='(') return false; else s.pop(); break;
                case '}': if (s.empty() || s.peek()!='{') return false; else s.pop(); break;
                case ']': if (s.empty() || s.peek()!='[') return false; else s.pop(); break;
                default: ;
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        valid_parenthesis obj = new valid_parenthesis();
        String str = sc.next();
        System.out.println(obj.check(str));
    }
}
