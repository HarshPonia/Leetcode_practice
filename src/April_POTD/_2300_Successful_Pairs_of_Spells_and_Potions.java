package April_POTD;

import java.util.*;
public class _2300_Successful_Pairs_of_Spells_and_Potions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0;i<spells.length;i++){
            pairs[i] = bs(spells[i],potions,success);
        }
        return pairs;
    }
    private int bs(int i,int [] potion,long success){
        int start = 0;
        int end = potion.length -1;
        while(start<=end){
            int mid  = start+(end-start) /2;
            if((long)i*potion[mid]>=success){
                end = mid-1;
            }
            else if(i*potion[mid]<success){
                start = mid+1;
            }
        }
        return potion.length-start;
    }
}
