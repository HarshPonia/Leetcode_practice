package Sliding_Window;
//Date: 05-06-2023

import java.util.*;
public class M_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int c =0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int  i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(map.get(s.charAt(i))+1,left);
            }
            map.put(s.charAt(i),i);
            c = Math.max(c, i-left+1);
        }
        return c;
    }
}
