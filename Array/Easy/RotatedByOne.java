package Array.Easy;
import java.util.*;
public class RotatedByOne {

    public static void main(String args[]){
        int arr[] ={1,2,3,4,5};
        int n = arr.length, temp = arr[arr.length-1];
        // for(int i=n-1;i>0;i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[0] = temp;

        for (int i = arr.length - 1; i > 0; i--) {
            int last = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = last;
        }

        for(int ar:arr){
            System.out.println(ar);
        }
    }
}