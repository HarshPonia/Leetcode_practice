import java.util.*;

public class _3rd_maximum {
//    public static int max(int[] arr,int n){
//        Arrays.sort(arr);
//        int c = 3;
//        int j  = -1;
//        for(int i = n-1;i>0;i--){
//            if(c == 0){
//                return j==-1?j:arr[j];
//            }
//            else if(arr[i] != arr[i-1]){
//                c--;
//                j =i;
//            }
//        }
//        return j==-1?j:arr[j];
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i] = sc.nextInt();
//        System.out.println(max(arr,n));
//        }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        HashMap<Character,Character> map= new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            if (!map.containsKey(s1.charAt(i)) && s1.charAt(i) != s2.charAt(i)) {
                map.put(s1.charAt(i), s2.charAt(i));
            }
        }
            if (map.size() > 2) return false;
            else {
                Set<Character> e = map.keySet();
                for (Character x : e) {
                    if(map.get(x) != x){
                        if (map.get(map.get(x)) == x) {
                            return true;
                        }
                    }
                }
                return false;
            }
    }
        public static void main(String args[]) {
            String s1="bank";
            String s2="kanb";
            System.out.println(areAlmostEqual(s1,s2));
        }
}
