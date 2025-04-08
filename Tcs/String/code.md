### Check if a given string is palindrome or not

```java
import java.util.*;

class Main {
    public static boolean isPalindrome(String str) {
        // str = str.toLowerCase().replaceAll("\\s+", ""); // Convert to lowercase and remove spaces
        int i = 0, j = str.length() - 1;
        
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Directly return false if mismatch found
            }
            i++;
            j--;
        }
        return true; // Return true if no mismatch found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        if (isPalindrome(str)) {
            System.out.println("It is a palindrome string.");
        } else {
            System.out.println("It is not a palindrome string.");
        }
        
        sc.close(); // Close the scanner
    }
}

```

### Count number of vowels, consonants, spaces in String

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int consonant = 0, vowel = 0, space = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == ' ') {
                space++;
            } else if (ch >= 'a' && ch <= 'z') { // Only check alphabets
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Number of Vowels: " + vowel);
        System.out.println("Number of Consonants: " + consonant);
        System.out.println("Number of Spaces: " + space);

        sc.close(); // Closing the scanner
    }
}

```

### Find the ASCII value of a character

```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        char ch = 'a';
        int a = (int)ch;
        System.out.print(a);
    }
}
```

### Remove all vowels from the string

```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.print(sb.toString());
    }
}
```

### Remove characters from a string except alphabets

```java

```