### Second Largest and Smallest
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int SmallestNum(int[] arr){
        int small = arr[0];
        for(int i=1;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
    public static int SecondLargest(int[] arr){
        if(arr.length<2)return -1;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secLargest){
                secLargest=arr[i]; 
            }else{
                secLargest = largest;
            }
        }
        return secLargest;
    }
    
    public static int SecondSmallest(int[] arr){
        if(arr.length<2)return -1;
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                secSmallest = smallest;
                smallest = arr[i];
            }else if(smallest<arr[i] && secSmallest>arr[i]){
                secSmallest=arr[i];
            }else{
                secSmallest = smallest;
            }
        }
        return secSmallest;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of array: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
        int smallest = SmallestNum(arr);
        //  System.out.println(smallest);
         System.out.println("Second largest: "+ SecondLargest(arr) +" Second smallest: "+ SecondSmallest(arr));
        // for(int a: arr){
        //     System.out.print(a + " ");
        // } 
        sc.close();
    }
}
```

### Reverse Array
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void Reverse(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // for(int a: arr){
        //     System.out.print(a + " ");
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of array: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         Reverse(arr);
          for(int a: arr){
            System.out.print(a + " ");
        }
        sc.close();
    }
}
```

### Count frequency of each element in an array

```java
import java.util.*;
// import java.util.HashMap;
// import java.util.Map;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of array: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         HashMap<Integer, Integer>mpp = new HashMap<>();
         for(int i=0;i<n;i++){
             mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
         }
         
         for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc.close();
	}
}
```

### Rearrange array in increasing-decreasing order

```java
import java.util.*;

class Main {
    // Bubble Sort with Optimization (Early Stopping)
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Stop if no swaps happened
            if (!swapped) break;
        }
    }

    // Reverse second half of the sorted array
    public static void reverseSecondHalf(int[] arr) {
        int mid = arr.length / 2;
        int left = mid, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);  // Step 1: Sort in ascending order
        reverseSecondHalf(arr);  // Step 2: Reverse second half

        System.out.println("\nHalf Ascending, Half Descending Sorted Array:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}

```


### Calculate sum of the elements of the array

