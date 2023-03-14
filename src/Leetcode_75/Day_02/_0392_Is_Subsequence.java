package Leetcode_75.Day_02;

public class _0392_Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int j = 0,i =0;
        while(i<len1 && j <len2){
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == len1 ? true:false;
    }
}
