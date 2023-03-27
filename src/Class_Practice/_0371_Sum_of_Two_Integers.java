package Class_Practice;
// Date : 27/03/2023
// Bit Manipulation

public class _0371_Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        while(b!=0){
            int c =  a&b;
            a = a^b;
            b = c << 1;
        }
        return a;
    }
}
