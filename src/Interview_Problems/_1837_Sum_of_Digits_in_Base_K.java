package Interview_Problems;

public class _1837_Sum_of_Digits_in_Base_K {
    public int sumBase(int n, int k) {
        int res = 0;
        while(n>0){
            res+=n%k;
            n/=k;
        }
        return res;
    }
}
