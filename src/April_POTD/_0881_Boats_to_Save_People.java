package April_POTD;
import java.util.*;
public class _0881_Boats_to_Save_People {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0, n = people.length;
        Arrays.sort(people);
        int p1 = 0, p2 = n-1;
        while(p1<=p2){
            count++;
            if(people[p1]+people[p2]<=limit){
                p1++;
                p2--;
            }
            else{
                p2--;
            }
        }
        return count;
    }
}
