import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class Third_maximum_number
{
    public int Maximum(int nums[]){
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        for (int num:nums)
        {

            if (num > fmax)
            {
                tmax = smax;
                smax = fmax;
                fmax = num;
            }
            else if (num > smax && fmax>num)
            {
                tmax = smax;
                smax = num;
            }
            else if (num > tmax && smax>num)
                tmax = num;
        }
//
        return tmax==Integer.MIN_VALUE?fmax:tmax;
//        long max1 = Long.MIN_VALUE; // the maximum
//        long max2 = Long.MIN_VALUE; // 2nd maximum
//        long max3 = Long.MIN_VALUE; // 3rd maximum
//
//        for (final int num : nums)
//            if (num > max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = num;
//            } else if (max1 > num && num > max2) {
//                max3 = max2;
//                max2 = num;
//            } else if (max2 > num && num > max3) {
//                max3 = num;
//            }
//
//        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Third_maximum_number obj = new Third_maximum_number();
        System.out.println(obj.Maximum(arr));
    }
}
