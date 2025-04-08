### 15 March Coding Question

# Making Triplets Equals--------------------


```java
 import java.util.*;
class Main {
    public static int countSteps(int p, int q, int r){
        int[] arr = new int[]{p, q, r};
        if(arr[0]==arr[1]&&arr[1]==arr[2]) return 0;
        int step=0;
        Arrays.sort(arr);
        while(true){
            arr[0]+=1;
            arr[1]+=1;
            arr[2]-=1;
            step++;
            Arrays.sort(arr);
            if(arr[0]==arr[1]&&arr[1]==arr[2]) return step;
            
            if(arr[0]==arr[1]&&arr[1]+1==arr[2]) return -1;

            if(arr[1]==arr[2]&&arr[0]+1==arr[1]) return -1;
            
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the T(no of test case) : ");
    int t = sc.nextInt();
    while(t-->0){
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(countSteps(p, q, r));
    }
    }
}
```
**Optimize code**

```java
import java.util.*;

class Main {
    public static int countSteps(int p, int q, int r) {
        int[] arr = new int[]{p, q, r};
        Arrays.sort(arr);  // Sort once at the beginning
        int step = 0;

        while (true) {
            // If all numbers are equal, return the steps taken
            if (arr[0] == arr[1] && arr[1] == arr[2]) return step;

            // If making them equal is impossible
            if ((arr[2] - arr[0]) % 2 != 0) return -1;

            // Increment the two smaller numbers and decrement the largest one
            arr[0]++;
            arr[1]++;
            arr[2]--;
            step++;

            // Ensure arr[0] <= arr[1] <= arr[2]
            Arrays.sort(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the T (number of test cases): ");
        int t = sc.nextInt();

        while (t-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(countSteps(p, q, r));
        }
        sc.close();
    }
}

```


# Range Sum Query

```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 10000;
        long[] prefix = new long[Max];
        prefix[0] = 0;
        for(int i=1;i<Max;i++){
            prefix[i] = prefix[i-1]+i;
        }
        
        int T = sc.nextInt();
        while(T-->0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            if(i<0 || i>=j|| j>=Max){
                System.out.print("Invalid Input.");
                continue;
            }
            
            long sum = prefix[j] - (i>0?prefix[i-1]:0);
            System.out.print(sum);
        }
    }
}
```