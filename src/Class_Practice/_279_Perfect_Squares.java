package Class_Practice;
import java.util.*;
public class _279_Perfect_Squares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        dp[1] = 1;
        for(int i =0;i<=n;i++){
            for(int j =1;j<=i;j++){
                if(i-j*j>=0)
                    dp[i] = Math.min(dp[i-j*j]+1,dp[i]);

            }
        }
        return dp[n];
    }
}
