import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Intersection_of_two_Array {
    public int[] intersection(int[] nums1, int[] nums2) {
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
                if(q==0){
                    arr[q] = nums1[i];
                    q++;
                    i++;
                    j++;
                }
                else{
                    if(arr[q-1] != nums1[i]) {
                        arr[q] = nums1[i];
                        q++;
                        i++;
                        j++;
                    }
                    else{
                        i++;
                        j++;
                    }

                }
            }
        }
        arr = Arrays.copyOfRange(arr,0,q);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array  : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the array element : ");
        for(int i =0;i<n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array : ");
        int n2  = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the Array element : ");
        for(int i =0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        Intersection_of_two_Array obj = new Intersection_of_two_Array();
        System.out.println(obj.intersection(arr1,arr2));
    }
}
