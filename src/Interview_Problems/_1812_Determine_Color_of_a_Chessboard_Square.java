package Interview_Problems;
// Date 27/03/2023
// Maths
// String
public class _1812_Determine_Color_of_a_Chessboard_Square {
    public boolean squareIsWhite(String c) {
        int ans = 0;
        ans+= c.charAt(0)-96;
        int b = c.charAt(1);
        if((ans+b)%2==0) return false;
        return true;
    }
}
