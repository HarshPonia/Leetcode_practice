package Interview_Problems;

public class _1287_Element_Appearing_More {
    private float calcPer(int n,int count){
        return ((float)count/(float)n)*100;
    }
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int count = 1;
        for(int i=0; i<n-1;i++){
            if(arr[i] != arr[i+1]){
                float per = calcPer(n,count);
                if(per > 25) return arr[i];
                count =1;
            }
            else count++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1,1};
        new _1287_Element_Appearing_More().findSpecialInteger(arr);
    }
}
