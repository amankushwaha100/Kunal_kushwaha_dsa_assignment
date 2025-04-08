### Check if a number is palindrome or not
```java
import java.util.*;

class Main {
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;  // Palindromes should be non-negative

        int rev = 0, num = n;
        while (n > 0) {  // ✅ Correct condition
            int ln = n % 10;
            rev = rev * 10 + ln;
            n /= 10;
        }
        return rev == num;  // Directly return boolean result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

```

### Find all Palindrome numbers in a given range

```java
import java.util.*;

class Main {
    public static boolean isPalindrome(int num) {
        if (num < 0) return false;  // Negative numbers are not palindromes

        int temp = num, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return num == rev;  // Directly return boolean
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the min of range: ");
        int min = sc.nextInt();
        System.out.print("Enter the max of range: ");
        int max = sc.nextInt();
        sc.close(); // ✅ Prevents memory leak

        int count = 0;
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal number of Palindrome Numbers: " + count);
    }
}

```

### Check if a number is prime or not

```java
import java.util.*;

class Main {
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false; // ✅ Fixes incorrect condition
        if (num == 2) return true;
        if (num % 2 == 0) return false; // ✅ Eliminates even numbers

        for (int i = 3; i * i <= num; i += 2) { // ✅ Optimized loop
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // ✅ Prevents resource leak

        if (isPrimeNumber(num)) {
            System.out.println("Yes, it is a prime number.");
        } else {
            System.out.println("No, it is not a prime number.");
        }
    }
}

```

### Check if a number is armstrong number or not

```java
import java.util.*;

class Main {
    public static int pow(int n, int p) {
        int result = 1; // ✅ Initialize power calculation correctly
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close(); // ✅ Prevent resource leak

        int temp = n, count = 0;
        
        // ✅ Count the number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = n; // ✅ Reset temp to the original number
        int sum = 0;

        // ✅ Compute the Armstrong sum
        while (temp > 0) {
            int rem = temp % 10;
            sum += pow(rem, count); // ✅ Using the corrected power function
            temp /= 10;
        }

        // ✅ Print result correctly
        if (n == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
```

### Check if a number is perfect number

```java
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num%2!=0) return false;
       //int n=num/2;
       int ans=0;
       for(int i=1;i<num/2;i++){
        if(num%i==0){
            ans+=i;
        }
       }
       ans=ans+num/2;
       if(ans==num) return true;
       else return false;
    }
}
```

### Program to find sum of GP Series

```java
import java.util.*;

class Main {
    public static double sumOfGP(double a, double r, int n) {
        if (r == 1) return n * a; // Special case when ratio is 1
        
        return a * (1 - Math.pow(r, n)) / (1 - r); // Corrected formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter common ratio (r): ");
        double r = sc.nextDouble();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        double sum = sumOfGP(a, r, n);
        System.out.println("Sum of the GP series: " + sum);

        sc.close();
    }
}

```

### Leap Year or not

```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%400==0||y%4==0 && y%100!=0){
            System.out.print("Leap Year ");
        }else{
            System.out.print("Not leap year ");
        }
    }
}
```

### Print Fibonacci up to Nth Term

```java
class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int first = 0, second = 1, curr = 1;
        
        for (int i = 2; i <= n; i++) {
            curr = first + second;
            first = second;
            second = curr;
        }
        
        return curr;
    }
}

```

### Factors of a given number

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.print("Factors: ");
        for (int i = 1; i * i <= n; i++) {  
            if (n % i == 0) {  
                System.out.print(i + " ");  // Print the first factor
                
                if (i != n / i) {  
                    System.out.print((n / i) + " ");  // Print the second factor
                }
            }
        }
        sc.close();
    }
}
```
*Another program for same*
```java
public class Divisors {
    public static void main(String[] args) {
        int n = 12;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // To avoid duplicates, print only one
                if (n / i == i) {
                    System.out.print(" " + i);
                } else {
                    System.out.print(" " + i + " " + (n / i));
                }
            }
        }
    }
}

```
