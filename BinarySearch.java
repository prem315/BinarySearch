
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
public class BinarySearch {
    //private BinarySearch(){
     //   
   // }
    public static int rank(int target, int[] a) {
        int min = 0;
        int max = a.length - 1;
        while (min <= max) {
            
            int mid = min + (max - min) / 2;
            if      (target < a[mid]) {
                max = mid - 1;
            }
            else if (target > a[mid]) {
                min = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String ar[]){
        //BinarySearch s = new BinarySearch();
         int target = 6;
         int[] a = {3,4,7,6,1,9,12,10};
         System.out.println("Array before Sorted:");
         for(int i=0; i<a.length ; i++){
             System.out.println(a[i]);
         }
         Arrays.sort(a);
         System.out.println("Sorted Array:");
         
         for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
         }
       // s.rank(target, a); 
        System.out.println("Found " + target + " at " + rank(target, a));
    }
    
}
