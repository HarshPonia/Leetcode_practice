import java.util.Arrays;

public class Inter_section_of_Arrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr= new int[Math.min(nums1.length, nums2.length)];
        int q = 0 , i =0 , j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                arr[q++] = nums1[i];
                i++;
                j++;
            }
        }
        arr = Arrays.copyOfRange(arr,0,q);
        return arr;
    }

    public static void main(String[] args) {

    }
}
