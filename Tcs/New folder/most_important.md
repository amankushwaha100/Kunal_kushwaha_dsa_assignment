
```java

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] exercise = new String[7];
        
        for(int i = 0; i < 7; i++) {
            exercise[i] = sc.nextLine();
        }
        
        int totalSum = 0;
        
        for(String day : exercise) {
            String num = "";
            int n = day.length();
            for(int i = n - 1; i >= 0; i--) {
                if(day.charAt(i) == ' ') {
                    break;
                }
                num = day.charAt(i) + num; // ✅ Corrected this line
            }
            totalSum += Integer.parseInt(num);
        }
        
        System.out.print(totalSum);
    }
}

```

```java 
for (String day : exercise) {
    String num = "";
    for (int i = day.length() - 1; i >= 0; i--) {
        char ch = day.charAt(i);
        if (Character.isDigit(ch)) {
            num = ch + num;
        } else if (!num.isEmpty()) {
            break; // pehle digit mil chuka, ab stop
        }
    }
    totalSum += Integer.parseInt(num);
}
```

```java
